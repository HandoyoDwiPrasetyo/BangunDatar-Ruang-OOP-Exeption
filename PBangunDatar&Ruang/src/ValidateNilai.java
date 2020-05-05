public class ValidateNilai {
    private double a, b;

    public ValidateNilai(double a) throws Exception {
        this.a = a;
        if (a <= 0 ){
            throw new Exception("Input Tidak Boleh Kurang dari Sama Dengan 0 ");
        }
    }

    public ValidateNilai(double a, double b) throws Exception {
        this.a = a;
        this.b = b;
        if (a <= 0 || b <=0 ){
            throw new Exception("Input Tidak Boleh Kurang dari Sama Dengan 0 ");
        }
    }

    public ValidateNilai(double a, double b, double c, double d) throws Exception {
        this.a = a;
        this.b = b;
        if (a <= 0 || b <=0 || c <= 0 || d <= 0){
            throw new Exception("Input Tidak Boleh Kurang dari Sama Dengan 0 ");
        }else if (c < d){
            throw new Exception("\nTinggi kerucut yang di potong tidak boleh lebih dari Jari jari Kerucut");
        }
    }



}
