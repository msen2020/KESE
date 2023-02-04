package stepdefinitions_UI.dataBase;//package com.kese.stepdefinitions.Sprint_4;
//
//import com.mongodb.client.*;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import org.bson.Document;
//import static com.mongodb.client.model.Filters.eq;
//import static com.mongodb.client.model.Filters.or;
//
//public class US176_DB_Home_Excahange_Approval_StepD {
//    MongoDatabase database;
//    FindIterable<Document> homesWithApprovalZeroAndOne;
//
//    @Given("user connects to the database")
//    public void userConnectsToTheDatabase() {
//        String uri = "mongodb+srv://deneme:1234@cluster0.owokn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
//        MongoClient mongoClient = MongoClients.create(uri);
//        database = mongoClient.getDatabase("myFirstDatabase");
//    }
//
//    @And("user gets the Home Exchange ads list with an approval value of one or zero")
//    public void userGetsTheHomeExchangeList() {
//        homesWithApprovalZeroAndOne = database
//                .getCollection("homes")
//                .find(or(eq("approval", 0),eq("approval", 1)));
//        for (Document file:homesWithApprovalZeroAndOne) {
//            System.out.println(file.toJson());
//
//        }
//    }
//
//
//}
