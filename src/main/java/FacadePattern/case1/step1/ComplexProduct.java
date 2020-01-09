package FacadePattern.case1.step1;

/**
 * 이런 방식의 클래스가 있을 때 numchar에 값을 넣는게 너무 힘들다
 * 이럴 때 사용할 수 있는것이 파사드 패턴이다.
 */
public class ComplexProduct {
    char numChars[] = new char[10];

    public ComplexProduct() {
    }

    public void setFirstNameChar(char c) {
        numChars[0] = c;
    }

    public void setTwoNameChar(char c) {
        numChars[1] = c;
    }

    public void setThreeNameChar(char c) {
        numChars[2] = c;
    }

    public void setFourNameChar(char c) {
        numChars[3] = c;
    }

    public void setFiveNameChar(char c) {
        numChars[4] = c;
    }

    public void setSixNameChar(char c) {
        numChars[5] = c;
    }

    public String getName() {
        return numChars.toString();
    }
}
