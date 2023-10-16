package prototypeDP;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student aprBatchSt = new Student();
        aprBatchSt.setBatch("April 22");
        aprBatchSt.setAverageBatchPsp(88.0);

        registry.register("april22Batch", aprBatchSt);

        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("April 21");
        is.setAverageBatchPsp(95.0);
        is.setIq(180);  // students with iq >= 180

        registry.register("april21IntelligentBatch", is);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student vignesh = studentRegistry.get("april22Batch").clone(); // If clone is not used, original prototype gets modified
        vignesh.setName("Vignesh");
        vignesh.setAge(25);
        vignesh.setPsp(80);
        System.out.println(vignesh);

        Student sabahul = studentRegistry.get("april21IntelligentBatch").clone();
        sabahul.setName("Sabahul");
        sabahul.setAge(22);
        sabahul.setPsp(92);
        System.out.println(sabahul);
    }

}
