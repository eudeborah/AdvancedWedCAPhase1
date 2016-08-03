
package uno;

public class Card {
 
    private String color;
    private String type;
    private int value;
    private String images;

    public Card(String color, String type, int value) {
        this.color = color;
        this.type = type;
        this.value = value;
        this.images = color + type + value;
    }

    public Card(String color,String type){
        this.color=color;
        this.type=type;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Card{" + "color=" + color + ", type=" + type + ", value=" + value + ", images=" + images + '}';
    }
    
}

