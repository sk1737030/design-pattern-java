package FacadePattern.case1.step1;

public class TestPattern {

    public static void main(String[] args) {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("printer");
        System.out.println(simpleProductFacade.getName());
    }
}
