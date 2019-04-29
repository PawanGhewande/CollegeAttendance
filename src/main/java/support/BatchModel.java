/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import connections.FireStoreDB;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pawan
 */
public class BatchModel {

    public boolean saveBatches(String deptName, String className, String divName, String batchName, Map<String, Object> data) {
        boolean status = false;
        FireStoreDB db = new FireStoreDB();
        try {
            db.init();
            Firestore open = FirestoreClient.getFirestore();
            DocumentReference docRef = open.collection("departments").document(deptName).collection(className).document(divName).collection(batchName).document();
            ApiFuture<WriteResult> result = docRef.set(data);
            result.get();
            if (result.isDone()) {
                status = true;
                FireStoreDB.initializeApp.delete();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        return status;
    }
}
