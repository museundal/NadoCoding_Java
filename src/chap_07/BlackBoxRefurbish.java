package chap_07;

public class BlackBoxRefurbish {
    public String modelName;
    String resolution; // 해상도 , 아무것도 안 적으면 default
    private int price;
    protected String color;

     String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 1000000;
        } else {
            this.price = price;
        }
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의 하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    class A { // public이 없으니 default

    }
}
