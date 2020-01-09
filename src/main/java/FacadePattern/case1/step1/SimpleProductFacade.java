package FacadePattern.case1.step1;

public class SimpleProductFacade {
    ComplexProduct complexProduct;

    public SimpleProductFacade() {
        this.complexProduct = new ComplexProduct();
    }

    public String getName() {
        return complexProduct.getName();
    }

    public void setName(String n) {
        char chars[] = n.toCharArray();

        if (chars.length > 0) {
            complexProduct.setFirstNameChar(chars[0]);
        }
        if (chars.length > 1) {
            complexProduct.setFirstNameChar(chars[1]);
        }
        if (chars.length > 2) {
            complexProduct.setFirstNameChar(chars[2]);
        }
        if (chars.length > 3) {
            complexProduct.setFirstNameChar(chars[3]);
        }
        if (chars.length > 4) {
            complexProduct.setFirstNameChar(chars[4]);
        }
        if (chars.length > 5) {
            complexProduct.setFirstNameChar(chars[5]);
        }

    }
}
