/*
abdulrahman--AAE
 */
package questionbank;
import java.io.Serializable;


public class questions implements Serializable {

    String Q;
    String A1;
    String A2;
    String A3;
    String A4;
    String C_A;

    public questions() {

    }

    public questions(String Q, String A1, String A2, String A3, String A4, String C_A) {
        this.Q = Q;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.A4 = A4;
        this.C_A = C_A;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String Q) {
        this.Q = Q;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public String getA4() {
        return A4;
    }

    public void setA4(String A4) {
        this.A4 = A4;
    }

    public String getC_A() {
        return C_A;
    }

    public void setC_A(String C_A) {
        this.C_A = C_A;
    }

    @Override
    public String toString() {
        return "Q)" + Q + "\n A" + A1 + "\n A2" + A2 + "\n A3" + A3 + "\n A4" + A4 + "\n The correct answer is" + C_A;
    }

}