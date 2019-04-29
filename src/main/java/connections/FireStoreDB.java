/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author pawan
 */
public class FireStoreDB {
 public static FirebaseApp initializeApp;
    /**
     * <H2> DATA RETRIVE CODE </H2>
     * <CODE>
     * ApiFuture<QuerySnapshot> query = db.collection("users").get();
     * QuerySnapshot querySnapshot = query.get(); List<QueryDocumentSnapshot>
     * documents = querySnapshot.getDocuments(); for (QueryDocumentSnapshot
     * document : documents) { System.out.println("User: " + document.getId());
     * System.out.println("First: " + document.getString("name")); if
     * (document.contains("middle")) { System.out.println("Middle: " +
     * document.getString("middle")); } }
     * </CODE>
     *
     * @throws FileNotFoundException
     * @throws IOException
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws URISyntaxException
     */
    public void init() throws InterruptedException, ExecutionException, IOException, URISyntaxException {
        // Use a service account
        try {
            InputStream serviceAccount = new FileInputStream(getClass().getResource("/core/Attendance-6723967d3484.json").toURI().toString().replace("file:", ""));
            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
             initializeApp = FirebaseApp.initializeApp(options);
//            DocumentReference docRef = db.collection("USERS").document("A!");
//            Map<String, Object> data = new HashMap<>();
//            data.put("first", "Alan");
//            data.put("middle", "Mathison");
//            data.put("last", 20);
//            ApiFuture<WriteResult> result = docRef.set(data);
//            System.out.println(" is Inserted -------------->> " + result.get());
//            ApiFuture<QuerySnapshot> query = db.collection("users").get();
//            QuerySnapshot querySnapshot = query.get();
//            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
//            for (QueryDocumentSnapshot document : documents) {
//                System.out.println("User: " + document.getId());
//                System.out.println("First: " + document.getString("name"));
//                if (document.contains("middle")) {
//                    System.out.println("Middle: "
//                            + document.getString("middle"));
//                }
//            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        //return FirestoreClient.getFirestore();
    }

    /**
     * This method is useful for connecting database with the firestore.It
     * return <i>Firestore</i> class object as connection.
     *
     * @return Firestore
//     */
//    public Firestore open()  {
//    // Firestore open = db.open();
//            init();
//        return FirestoreClient.getFirestore();
//    }

}
