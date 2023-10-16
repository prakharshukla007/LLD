package builderDP;

public class Client {

    public static void main(String[] args) {
        // Option 1
//        Builder builder = Student.getBuilder();
//        builder.setAge(20);
//        builder.setName("Prakhar");
//        builder.setBatch("Advance");
//
//        Student student = builder.build();
//        System.out.println("DEBUG " + student);

        // Option 2
        Student student = Student.getBuilder()
                .setAge(20)
                .setName("Prakhar")
                .setBatch("Advance")
                .build();
        System.out.println(student);

    }

}
