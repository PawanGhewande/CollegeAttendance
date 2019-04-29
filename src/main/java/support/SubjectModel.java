/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import connections.FireStoreDB;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author pawan
 */
public class SubjectModel {

    public boolean saveSubject(String collection, String document, Map<String, Object> data) throws IOException, URISyntaxException {
        boolean status = false;
        FireStoreDB db = new FireStoreDB();
        try {
                db.init();
                Firestore open = FirestoreClient.getFirestore();
            DocumentReference docRef = open.collection(collection).document(document);

            ApiFuture<WriteResult> result = docRef.set(data);

            result.get();
            if (result.isDone()) {
                status = true;
                FireStoreDB.initializeApp.delete();
            }
            //System.out.println("Update time : " + result.get().getUpdateTime());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
        return status;
    }
}
