package utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hypnotes.enums.APIENDPOINT;
import com.hypnotes.enums.USERINFO;
import com.hypnotes.pojos.Categories.GetAll.GetAllCategory;
import com.hypnotes.pojos.UserInfo.GetAllUserInfo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.hypnotes.stepDefinitions.UIStepDef.Hooks.*;
import static io.restassured.RestAssured.given;

public class ApiUtilities {
    public static Response response;
    static ObjectMapper objectMapper = new ObjectMapper();
    static JsonPath jsonPath;
    static ResponseSpecification responseSpecification;
    static RequestSpecification requestSpecification;
    static Map<String, Object> payload = new HashMap<>();
    static JSONObject requestBody = new JSONObject();
    public static RequestSpecification specification = new RequestSpecBuilder().
            addCookie(new Cookie.Builder("PHPSESSID", userSessionID).build()).
            setBaseUri("https://test.hypnotes.net/api").
            setRelaxedHTTPSValidation().
            build();

    public static void login(String email, String password) {
        response = given()
                .contentType(ContentType.JSON)
                .body("username="+ email +
                        "&password="+ password)
                .post(APIENDPOINT.USER.LOGIN.getEndpoint(isTestEnvironment));

        response.prettyPrint();
        Assert.assertEquals(200, response.getStatusCode());

    }

    // Status code doğrulaması yapar
    public static void verifyStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    // Bağlantıya form param ekler
    public static void addFormParam(String key, String value) {
        specification.formParam(key, value);
    }

    // Bağlantıya form params ekler
    public static void addFormParams(Map<String, String> params) {
        specification.formParams(params);
    }

    // Kullanıcı istediği endpoint'e post tipinde ve daları form params içerisinde göndererek bağlanabilecek
    public static void connectWithPostMethodFormParams(String endPoint, Map<String, String> data) {
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                formParams(data).
                post(endPoint);
    }

    // Kullanıcı istediği endpoint'e post tipinde ve daları body bölümünde göndererek bağlanabilecek
    public static void connectWithPostMethodBody(String endPoint, Map<String, String> data) {

        JSONObject object = new JSONObject();
        for (String s : data.keySet()) {
            object.put(s, data.get(s));
        }

        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                body(data.toString()).
                post(endPoint);
    }

    // Kullanıcı istediği endpoint'e post tipinde bağlanabilecek
    public static void connectWithPostMethod(String endPoint) {
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                post(endPoint);
    }

    public static void setupSpecification() {

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        if (isTestEnvironment) {

            requestSpecBuilder.setBaseUri("https://test.hypnotes.net/api");
        } else {
            requestSpecBuilder.setBaseUri("https://hypnotes.net/api");
        }
        requestSpecBuilder.addHeader("content-type", "application/x-www-form-urlencoded");
        requestSpecBuilder.addHeader("cookie", "PHPSESSID=" + userSessionID);
        requestSpecification = requestSpecBuilder.build();

        responseSpecBuilder.expectStatusCode(200);
        responseSpecBuilder.expectResponseTime(Matchers.lessThan(5000L));
        // responseSpecBuilder.expectBody("success", Matchers.equalTo(true));
        responseSpecification = responseSpecBuilder.build();

    }

    public static void setupSpecification(String userSessionID, boolean isTestEnvironment) {

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        if (isTestEnvironment) {

            requestSpecBuilder.setBaseUri("https://test.hypnotes.net/api");
        } else {
            requestSpecBuilder.setBaseUri("https://hypnotes.net/api");
        }
        requestSpecBuilder.addHeader("content-type", "application/x-www-form-urlencoded");
        requestSpecBuilder.addHeader("cookie", "PHPSESSID=" + userSessionID);
        requestSpecification = requestSpecBuilder.build();

        responseSpecBuilder.expectStatusCode(200);
        responseSpecBuilder.expectResponseTime(Matchers.lessThan(5000L));
        // responseSpecBuilder.expectBody("success", Matchers.equalTo(true));
        responseSpecification = responseSpecBuilder.build();

    }

    public static class Sessions {

        public static void CreateIndividualSessions(boolean isTestEnvironment, String sessionId, String title, int price, boolean showPrice, int duration, boolean blockBefore, boolean blockAfter, boolean paymentRequired, boolean bookable, String desc, boolean online) {

            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&blockBefore=" + BrowserUtilities.booleanToInt(blockBefore) +
                            "&blockAfter=" + BrowserUtilities.booleanToInt(blockAfter) +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&description=" + desc +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }

        public static String CreateIndividualSessions(boolean isTestEnvironment, String sessionId, String title) {
            int price = 100;
            boolean showPrice = true;
            int duration = 30;
            boolean blockBefore = false;
            boolean blockAfter = true;
            boolean paymentRequired = true;
            boolean bookable = true;
            String desc = "individual";
            boolean online = true;
            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&blockBefore=" + BrowserUtilities.booleanToInt(blockBefore) +
                            "&blockAfter=" + BrowserUtilities.booleanToInt(blockAfter) +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&description=" + desc +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());
            response.prettyPrint();
            return response.jsonPath().getString("category.id");

        }

        public static String CreateIndividualSession(String title, int price) {
            boolean showPrice = true;
            int duration = 30;
            boolean blockBefore = false;
            boolean blockAfter = true;
            boolean paymentRequired = true;
            boolean bookable = true;
            String desc = "individual";
            boolean online = true;

            response = given()
                    .contentType(ContentType.JSON)
                    .spec(specification)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&blockBefore=" + BrowserUtilities.booleanToInt(blockBefore) +
                            "&blockAfter=" + BrowserUtilities.booleanToInt(blockAfter) +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&description=" + desc +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));

            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getString("category.id");
        }

        public static void CreatePackageSessions(boolean isTestEnvironment, String sessionId, String title, int price, boolean showPrice, int totalSessions, int sessionInterval, int duration, boolean blockBefore, boolean blockAfter, boolean paymentRequired, boolean bookable, String desc, boolean online) {

            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&totalSessions=" + totalSessions +
                            "&sessionInterval=" + sessionInterval +
                            "&description=" + desc +
                            "&blockBefore=" + BrowserUtilities.booleanToInt(blockBefore) +
                            "&blockAfter=" + BrowserUtilities.booleanToInt(blockAfter) +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }

        public static void CreatePackageSessions(String title) {
            int price = 50;
            boolean showPrice = true;
            int totalSessions = 6;
            int sessionInterval = 4;
            int duration = 50;
            boolean blockBefore = true;
            boolean blockAfter = true;
            boolean paymentRequired = true;
            boolean bookable = true;
            String desc = "package";
            boolean online = true;
            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + userSessionID)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&totalSessions=" + totalSessions +
                            "&sessionInterval=" + sessionInterval +
                            "&description=" + desc +
                            "&blockBefore=" + BrowserUtilities.booleanToInt(blockBefore) +
                            "&blockAfter=" + BrowserUtilities.booleanToInt(blockAfter) +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());
        }

        public static int CreateGroupSessions(boolean isTestEnvironment, String sessionId, String title, int price, boolean showPrice, int attendeeLimit, String sessionDate, int duration, boolean isGroupSession, boolean paymentRequired, boolean bookable, String desc, boolean online) {

            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&attendeeLimit=" + attendeeLimit +
                            "&sessionDate=" + sessionDate +
                            "&description=" + desc +
                            "&isGroupSession=" + BrowserUtilities.booleanToInt(isGroupSession) +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getInt("category.id");
        }

        public static String CreateGroupSessions(boolean isTestEnvironment, String sessionId, String title, String sessionDate) {
            int price = 45;
            boolean showPrice = true;
            int attendeeLimit = 50;
            int duration = 50;
            boolean isGroupSession = true;
            boolean paymentRequired = true;
            boolean bookable = true;
            String desc = "group";
            boolean online = true;
            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("title=" + title +
                            "&price=" + price +
                            "&showPrice=" + BrowserUtilities.booleanToInt(showPrice) +
                            "&duration=" + duration +
                            "&paymentRequired=" + BrowserUtilities.booleanToInt(paymentRequired) +
                            "&bookable=" + BrowserUtilities.booleanToInt(bookable) +
                            "&attendeeLimit=" + attendeeLimit +
                            "&sessionDate=" + sessionDate +
                            "&description=" + desc +
                            "&isGroupSession=" + BrowserUtilities.booleanToInt(isGroupSession) +
                            "&online=" + online
                    )
                    .post(APIENDPOINT.CATEGORY.CREATECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());
            return response.jsonPath().getString("category.title");
        }

        public static void DeleteSession(boolean isTestEnvironment, String sessionId, int categoryId) {

            response = given()
                    .contentType(ContentType.JSON)
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("categoryId=" + categoryId)
                    .post(APIENDPOINT.CATEGORY.REMOVECATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }

        public static Response getAllSessionsInfo(boolean isTestEnvironment, String sessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .post(APIENDPOINT.SESSION.GETSESSIONINFO.getEndpoint(isTestEnvironment));
            return response;
        }

        public static void deleteIndividualSession(boolean isTestEnvironment, String sessionId, String categoryId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("categoryId=" + categoryId)
                    .post(APIENDPOINT.SESSION.DELETE_INDSESSION.getEndpoint(isTestEnvironment));
            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());
        }
    }


    public static class Category {


        //******* get  ************************
        public static GetAllCategory[] getAllCategoryInfo(boolean isTestEnvironment, String sessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("")
                    .post(APIENDPOINT.CATEGORY.GETALLCATEGORY.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

            GetAllCategory[] getAllCategory = new GetAllCategory[0];
            try {
                getAllCategory = objectMapper.readValue(response.asString(), GetAllCategory[].class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return getAllCategory;
        }

    }

    public static class Meetings {

        public static Response getAllMeetingsInfo(boolean isTestEnvironment, String sessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    //.body("")
                    .post(APIENDPOINT.CATEGORY.GETALLMEETINGS.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

            return response;
        }

        public static List<Integer> getAllMeetingsId(boolean isTestEnvironment, String sessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("")
                    .post(APIENDPOINT.CATEGORY.GETALLMEETINGS.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());
            return response.jsonPath().getList("id");
        }

        public static void setMeetingColor(boolean isTestEnvironment, String sessionId, int meetingId, String title) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("MeetingId=" + meetingId +
                            "&Title=" + title)
                    .post(APIENDPOINT.CALENDAR.SETMEETINGCOLOUR.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());


        }

        public static void cancelMeeting(boolean isTestEnvironment,
                                         String sessionId,
                                         int userId,
                                         int meetingId,
                                         String meetingDate,
                                         String userName,
                                         String userEmail,
                                         String clientName,
                                         String clientSurname,
                                         String clintEmail) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("userId=" + userId +
                            "&meetingId=" + meetingId +
                            "&meetingDate=" + meetingDate +
                            "&userName=" + userName +
                            "&userEmail=" + userEmail +
                            "&clientName=" + clientName +
                            "&clientSurname=" + clientSurname +
                            "&clintEmail=" + clintEmail
                    )
                    .post(APIENDPOINT.APPOINTMENT.CANCELAPPOINTMENT.getEndpoint(isTestEnvironment));
            // TODO: 02/12/2022 burasi an itibariyle hatali duzelince acilmasi gerekiyor   Assert.assertEquals(200, response.statusCode());


        }

        public static void cancelMeetingAll(boolean isTestEnvironment,
                                            String sessionId,
                                            int userId,
                                            List<Integer> meetingId,
                                            List<String> meetingDate,
                                            USERINFO therapist,
                                            USERINFO client) {
            try {
                for (int i = 0; i < meetingDate.size(); i++) {
                    Meetings.cancelMeeting(isTestEnvironment,
                            sessionId,
                            userId,
                            meetingId.get(i),
                            meetingDate.get(i),
                            therapist.getFullName(),
                            therapist.getEmail(),
                            client.getName(),
                            client.getFullName(),
                            client.getEmail()

                    );
                }
            } catch (Exception e) {

            }

        }

        public static void setMeeting_individual(
                boolean isTestEnvironment,
                String sessionId,
                int service,
                int hourToSkip,
                USERINFO client) {
            String serviceType = "registered";
            String location = "Online";
            String clientType = "registeredClients";
            String timezone = "Europe/London";
            boolean notify = false;
            String datetime = BrowserUtilities.getYear_month_day_time(hourToSkip); //2022-10-05 12:00
            int client_Id = client.getId();
            String client_email = client.getEmail();
            String client_surname = client.getFullName();
            String client_name = client.getName();
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(
                            "serviceType=" + serviceType +
                                    "&location=" + location +
                                    "&clientType=" + clientType +
                                    "&service=" + service +
                                    "&notify=" + notify +
                                    "&datetime=" + datetime +
                                    "&timezone=" + timezone +
                                    "&selectedClient[id]=" + client_Id +
                                    "&selectedClient[email]=" + client_email +
                                    "&selectedClient[surname]=" + client_surname +
                                    "&selectedClient[name]=" + client_name
                    )
                    .post(APIENDPOINT.APPOINTMENT.SETAPPOINTMENT.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }

        public static void setMeeting_package(
                boolean isTestEnvironment,
                String sessionId,
                int service,
                boolean notify,
                String datetime,
                int client_therapist_Id,
                String client_email) {
            String serviceType = "registered";
            String location = "Online";
            String clientType = "registeredClients";
            String timezone = "Europe/London";
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(
                            "serviceType=" + serviceType +
                                    "&location=" + location +
                                    "&clientType=" + clientType +
                                    "&service=" + service +
                                    "&notify=" + notify +
                                    "&datetime=" + datetime +
                                    "&timezone=" + timezone +
                                    "&selectedClient[id]=" + client_therapist_Id +
                                    "&selectedClient[email]=" + client_email
                    )
                    .post(APIENDPOINT.APPOINTMENT.SETAPPOINTMENT.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }
    }

    public static class Client {
        //        public static void createClient(boolean isTestEnvironment, String sessionId,String name,String surname,int phone,String timeZone,String city,String state,String country) {
        public static int createClient(boolean isTestEnvironment, String sessionId, String firstName, String lastName, String email) {
            String timezone = "GMT Standard Time";
            String city = "";
            String state = "";
            String country = "";
            String phone = "132456";
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("firstName=" + firstName +
                                    "&lastName=" + lastName +
                                    "&email=" + email +
                                    "&phone=" + phone +
                                    "&timezone=" + timezone
//                            +
//                            "&city=" + city +
//                            "&state=" + state +
//                            "&country=" + country

                    )
                    .post(APIENDPOINT.CLIENT.CREATECLIENT.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());
            return response.jsonPath().getInt("clientId");

        }

        public static List<Integer> getClientINFO(boolean isTestEnvironment, String sessionId) {

            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)

                    .post(APIENDPOINT.CLIENT.GETCLIENTINFO.getEndpoint(isTestEnvironment) + "?search=&page=1&sort=name");
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getList("clients.id");
        }

        public static List<String> getClientEmail(boolean isTestEnvironment, String sessionId) {

            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)

                    .post(APIENDPOINT.CLIENT.GETCLIENTINFO.getEndpoint(isTestEnvironment) + "?search=&page=1&sort=name");

            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getList("clients.email");
        }

        public static void deleteClient(boolean isTestEnvironment, String sessionId, int clientId) {

            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("clientId=" + clientId)
                    .post(APIENDPOINT.CLIENT.DELETECLIENT.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }


        public static void deleteClientAll(boolean isTestEnvironment, String sessionId) {
            List<Integer> clientINFO = getClientINFO(isTestEnvironment, userSessionID);
            for (int i = 0; i < clientINFO.size(); i++) {
                deleteClient(isTestEnvironment, sessionId, clientINFO.get(i));
            }

        }

        public static void deleteClientAll(boolean isTestEnvironment, String sessionId, int leaveClient) {
            List<Integer> clientINFO = getClientINFO(isTestEnvironment, userSessionID);
            if (clientINFO.size() > leaveClient) {
                for (int i = 0; i < clientINFO.size() - leaveClient; i++) {
                    deleteClient(isTestEnvironment, sessionId, clientINFO.get(i));
                }
            } else {
                for (int i = 0; i < clientINFO.size(); i++) {
                    deleteClient(isTestEnvironment, sessionId, clientINFO.get(i));
                }
            }
        }

    }

    public static class Session_Tab {


        public static int create_session(boolean isTestEnvironment, String sessionId, int clientId) {

            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("clientId=" + clientId)
                    .post(APIENDPOINT.SESSION.CREATE_SESSION.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getInt("session.id");
        }

        public static void delete_session(boolean isTestEnvironment, String sessionId, int clientId, int deletedSessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(
                            "clientId=" + clientId +
                                    "&sessionId=" + deletedSessionId
                    )
                    .post(APIENDPOINT.SESSION.DELETE_SESSION.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

        }

        public static List<Integer> get_sessionInfo(boolean isTestEnvironment, String sessionId, int clientId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)

                    .post(APIENDPOINT.SESSION.GET_SESSION.getEndpoint(isTestEnvironment, clientId));
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getList("sessions.id");
        }


    }

    public static class User {
        public static GetAllUserInfo getInfo(boolean isTestEnvironment, String sessionId, String timezone) {
            GetAllUserInfo getAllUserInfo;
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("timezone=" + timezone)
                    .post(APIENDPOINT.USER.GETUSER.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());

            try {
                getAllUserInfo = objectMapper.readValue(response.asString(), GetAllUserInfo.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return getAllUserInfo;
        }

        public static Response getInfo(boolean isTestEnvironment, String sessionId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("timezone=" + "Europe/London")
                    .post(APIENDPOINT.USER.GETUSER.getEndpoint(isTestEnvironment));
            Assert.assertEquals(200, response.statusCode());


            //icerigi surekli degisiyor jsonpath den gitmek daha guzel olacak gibi
//            try {
//                getAllUserInfo = objectMapper.readValue(response.asString(), GetAllUserInfo.class);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            return getAllUserInfo;
            response.prettyPrint();
            return response;
        }
    }

    public static class Coupon {

        public static CouponInfo applyPromoCode(boolean isTestEnvironment, String sessionId, String promoCode, int price) {

            response = given()
                    .headers(
                            "content-type", "application/json; charset=utf-8",
                            "cookie", "PHPSESSID=" + sessionId)
//                    .body(
//
//                            "promoCode=" + promoCode +
//                                    "&price=" + price
//                    )
                    .body("{\"promoCode\":\"" + promoCode + "\",\"price\":" + price + "}")

                    .post(APIENDPOINT.PROMOCODE.APPLY_PROMOCODE.getEndpoint(isTestEnvironment));
            jsonPath = response.jsonPath();
            CouponInfo coupon = new CouponInfo();


            //general
            coupon.setCoupon(jsonPath.getBoolean("isCoupon"));
            coupon.setStatusCode(response.getStatusCode());

            // positive
            try {
                coupon.setMessage(jsonPath.getString("message"));
                coupon.setDurationInMonthly(jsonPath.getInt("durationInMonthly"));
                coupon.setLastPrice(jsonPath.getInt("lastPrice"));
            } catch (NullPointerException e) {
            }


            //negative
            try {
                coupon.setDescr(jsonPath.getString("descr"));
            } catch (NullPointerException e) {

            }
            return coupon;
        }

        public static int createCoupon(boolean isTestEnvironment, String sessionId, String promoCode, int category) {

            String promoCodeName = "test1";
            String discountType = "price";

            String usersLimit = "20";
            int discountRate = 30;


            response = given()
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(
                            "&promoCode=" + promoCode +
                                    "&startedAt=" + BrowserUtilities.getDay_day_month_year_time(0) +
                                    "&endedAt=" + BrowserUtilities.getDay_day_month_year_time(48) +
                                    "&usersLimit=" + usersLimit +
                                    "&discountRate=" + discountRate +
                                    "&category=" + category +
                                    "&discountType=" + discountType
                    ).post(APIENDPOINT.PROMOCODE.ADD_PROMOCODE.getEndpoint(isTestEnvironment));

            Assert.assertEquals(200, response.statusCode());
            return Integer.parseInt(response.jsonPath().getString("promoCode.id"));

        }

        public static List<Integer> getCoupon() {
            response = given()
                    .spec(specification)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .post(APIENDPOINT.PROMOCODE.GET_PROMOCODE.getEndpoint(isTestEnvironment));
            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());
            return response.jsonPath().getList("numberOfUsers");

        }

        public static void createExpiredCoupon(boolean isTestEnvironment, String sessionId, String promoCode, String startDate, String endDate) {
            String discountType = "price";
            String usersLimit = "20";
            int discountRate = 30;
            int category = 1803;


            response = given()
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(
                            "&promoCode=" + promoCode +
                                    "&startedAt=" + startDate +
                                    "&endedAt=" + endDate +
                                    "&usersLimit=" + usersLimit +
                                    "&discountRate=" + discountRate +
                                    "&category=" + category +
                                    "&discountType=" + discountType
                    ).post(APIENDPOINT.PROMOCODE.ADD_PROMOCODE.getEndpoint(isTestEnvironment));
            response.prettyPrint();
            System.out.println(BrowserUtilities.getDay_day_month_year_time(-48));
            Assert.assertEquals(200, response.statusCode());
            //return response.jsonPath().get("promoCode.id");


        }

        public static String createCouponPercent(boolean isTestEnvironment, String promoCode, int startDate, int endDate, int usersLimit, int discountRate, String category) {
            payload.put("promoCode", promoCode);
            payload.put("startedAt", BrowserUtilities.getDay_day_month_year_time(startDate));
            payload.put("enddedAt", BrowserUtilities.getDay_day_month_year_time(endDate));
            payload.put("usersLimit", usersLimit);
            payload.put("discountRate", discountRate);
            payload.put("discountType", "percentage");
            payload.put("category", category);


            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post(APIENDPOINT.PROMOCODE.ADD_PROMOCODE.getEndpoint(isTestEnvironment));

            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());
            return response.jsonPath().getString("promoCode.code");


        }

        public static String createCouponPrice(String promoCode, int startDate, int endDate, int usersLimit, int discountRate, String category) {
            payload.put("promoCode", promoCode);
            payload.put("startedAt", BrowserUtilities.getDay_day_month_year_time(startDate));
            payload.put("enddedAt", BrowserUtilities.getDay_day_month_year_time(endDate));
            payload.put("usersLimit", usersLimit);
            payload.put("discountRate", discountRate);
            payload.put("discountType", "price");
            payload.put("category", category);

            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post(APIENDPOINT.PROMOCODE.ADD_PROMOCODE.getEndpoint(isTestEnvironment));

            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());

            return response.jsonPath().getString("promoCode.code");
        }

        public static void deleteCoupon(boolean isTestEnvironment, String sessionId, int couponId) {
            response = given()
                    .headers("content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("couponId=" + couponId)
                    .post(APIENDPOINT.PROMOCODE.DELETE_PROMOCODE.getEndpoint(isTestEnvironment));
            response.prettyPrint();
            Assert.assertEquals(200, response.statusCode());

        }

        public static int addCoupon(String promoCode, int startDate, int endDate, int usersLimit, int discountRate, String discountType, int category) {
            payload.put("promoCode", promoCode);
            payload.put("startedAt", BrowserUtilities.getDay_day_month_year_time(startDate));
            payload.put("enddedAt", BrowserUtilities.getDay_day_month_year_time(endDate));
            payload.put("usersLimit", usersLimit);
            payload.put("discountRate", discountRate);
            payload.put("discountType", discountType);
            payload.put("category", category);

            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post("/promoCode/add");

            response.prettyPrint();
            return response.jsonPath().get("promoCode.id");
        }

        @Data
        public static class CouponInfo {
            private String message, descr;
            private int durationInMonthly, lastPrice, statusCode;
            private boolean isCoupon;


        }
    }

    public static class Meeting {

        public static String createMeetingPositive(String schedulerId, String categoryId, String email, String firstName, String lastName, String phone, String datetime, String promoCode, String paymentType) {
            payload.put("timezone", "Europe/London");
            payload.put("categoryId", categoryId);
            payload.put("schedulerId", schedulerId);
            payload.put("email", email);
            payload.put("firstName", firstName);
            payload.put("lastName", lastName);
            payload.put("phone", phone);
            payload.put("datetime", datetime);
            payload.put("promoCode", promoCode);
            payload.put("promoCodeCheck", true);
            payload.put("paymentType", paymentType);
            payload.put("locationTitle", "Online");

            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post(APIENDPOINT.MEETING.CREATE_MEETING.getEndpointScheduler(isTestEnvironment));

            Assert.assertEquals(200, response.statusCode());
            response.prettyPrint();

            return response.jsonPath().getString("paymentUrl");
        }

        public static String createMeetingCreditCard(String schedulerId, String categoryId, String email, String firstName, String lastName, String phone, String datetime, String promoCode) {
            payload.put("timezone", "Europe/London");
            payload.put("categoryId", categoryId);
            payload.put("schedulerId", schedulerId);
            payload.put("email", email);
            payload.put("firstName", firstName);
            payload.put("lastName", lastName);
            payload.put("phone", phone);
            payload.put("datetime", datetime);
            payload.put("promoCode", promoCode);
            payload.put("promoCodeCheck", true);
            payload.put("paymentType", "authorize_net");
            payload.put("locationTitle", "Online");
            payload.put("pan", ConfigurationReader.getProperty("stripe_card_number"));
            payload.put("expireDate", ConfigurationReader.getProperty("stripe_expire_month_year"));
            payload.put("cvv", ConfigurationReader.getProperty("stripe_cvv"));
            payload.put("zipCode", ConfigurationReader.getProperty("stripe_zip"));
            payload.put("fullName", "Joe Doe");

            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post(APIENDPOINT.MEETING.CREATE_MEETING.getEndpointScheduler(isTestEnvironment));

            Assert.assertEquals(200, response.statusCode());
            response.prettyPrint();

            return response.jsonPath().getString("paymentUrl");
        }

        public static String createMeetingSquare(String schedulerId, String categoryId, String email, String firstName, String lastName, String phone, String datetime, String promoCode) {
            payload.put("timezone", "Europe/London");
            payload.put("categoryId", categoryId);
            payload.put("schedulerId", schedulerId);
            payload.put("email", email);
            payload.put("firstName", firstName);
            payload.put("lastName", lastName);
            payload.put("phone", phone);
            payload.put("datetime", datetime);
            payload.put("promoCode", promoCode);
            payload.put("promoCodeCheck", true);
            payload.put("paymentType", "square_up");
            payload.put("locationTitle", "Online");
            payload.put("squareSourceId", "cnon:CBASENGNgZXGt1dEIOYSMSQjWB0");

            response = given()
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .headers("content-type", "application/x-www-form-urlencoded")
                    .formParams(payload)
                    .post(APIENDPOINT.MEETING.CREATE_MEETING.getEndpointScheduler(isTestEnvironment));

            Assert.assertEquals(200, response.statusCode());
            response.prettyPrint();

            return response.jsonPath().getString("paymentUrl");
        }

    }

    public static class Location {

        public static void addLocation(
                boolean isTestEnvironment,
                String sessionId,
                String addressTitle,
                String address,
                String zipCode) {

            response = given()
                    .headers(
                            "content-type", "application/json; charset=utf-8",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(

                            "addressTitle=" + addressTitle +
                                    "&address=" + address +
                                    "&zipCode=" + zipCode +
                                    "&timeZone=" + "GMT Standard Time"
//                                    +
//                                    "&city=" + city+
//                                    "&state=" + state+
//                                    "&country=" + country
                    )

                    .post(APIENDPOINT.LOCATION.ADD_LOCATION.getEndpoint(isTestEnvironment));
        }

        public static void addLocation(
                boolean isTestEnvironment,
                String sessionId) {

            response = given()
                    .headers(
                            "content-type", "application/json; charset=utf-8",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body(

                            "addressTitle=" + faker.address().firstName() +
                                    "&address=" + faker.address().fullAddress() +
                                    "&zipCode=" + faker.address().zipCode() +
                                    "&timeZone=" + "GMT Standard Time"
//                                    +
//                                    "&city=" + city+
//                                    "&state=" + state+
//                                    "&country=" + country
                    )

                    .post(APIENDPOINT.LOCATION.ADD_LOCATION.getEndpoint(isTestEnvironment));
        }

        public static void deleteLocation(
                boolean isTestEnvironment,
                String sessionId,
                int addressId
        ) {

            response = given()
                    .headers(
                            "content-type", "application/x-www-form-urlencoded",
                            "cookie", "PHPSESSID=" + sessionId)
                    .body("id=" + addressId)

                    .post(APIENDPOINT.LOCATION.DELETE_LOCATION.getEndpoint(isTestEnvironment));

        }

    }


    public static class Colors {
        public static void setColor(String userSessionID, boolean isTestEnvironment, String colorType, String hex) {
            setupSpecification(userSessionID, isTestEnvironment);
            response = given()
                    .spec(requestSpecification)
                    .body(colorType + "=" + hex)
                    .expect()
                    .spec(responseSpecification)
                    .when()
                    .post("/schedule/inCalender/setCategoryColor");
            response.prettyPrint();
        }

        public static Map<String, String> getColor(String userSessionID, boolean isTestEnvironment) {

            setupSpecification(userSessionID, isTestEnvironment);
            Map<String, String> map = new HashMap<>();

            response = given()
                    .spec(requestSpecification)
                    .expect()
                    .spec(responseSpecification)
                    .when()
                    .post("/schedule/inCalender/getCategoryColor");


            List<String> title = response.jsonPath().getList("title");
            List<String> color = response.jsonPath().getList("color");

            for (int i = 0; i < title.size(); i++) {
                map.put(title.get(i), color.get(i));
            }


            Assert.assertEquals(response.statusCode(), 200);
            return map;


        }

        public static void setColor(String colorType, String hex) {
            setupSpecification();
            response = given()
                    .spec(requestSpecification)
                    .body(colorType + "=" + hex)
                    .expect()
                    .spec(responseSpecification)
                    .when()
                    .post("/schedule/inCalender/setCategoryColor");
        }

        public static Map<String, String> getColor() {

            setupSpecification();
            Map<String, String> map = new HashMap<>();

            response = given()
                    .spec(requestSpecification)
                    .expect()
                    .spec(responseSpecification)
                    .when()
                    .post("/schedule/inCalender/getCategoryColor");


            List<String> title = response.jsonPath().getList("title");
            List<String> color = response.jsonPath().getList("color");

            for (int i = 0; i < title.size(); i++) {
                map.put(title.get(i), color.get(i));
            }
            response.prettyPrint();
            return map;


        }

    }

}

