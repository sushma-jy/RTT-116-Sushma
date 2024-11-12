package Module303_10;


public class PrivateClassExamples {

    public void thisCanHaveAnyName() {
        InnerPrivateClass ipc = new InnerPrivateClass();
    }

    public static void main( String [] args ) {
        PrivateClassExamples pce = new PrivateClassExamples();

        pce.thisCanHaveAnyName();

        InnerPrivateClass ipc = new PrivateClassExamples().new InnerPrivateClass();
    }

    private class InnerPrivateClass {

        private String a;
        private String b;

    }

}
