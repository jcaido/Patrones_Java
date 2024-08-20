package builder.chessPiece;

public class ChessPiece {

    private String name;
    private String color;
    private String square;
    private double value;

    public String getName() {
        return name;
    }

    public ChessPiece setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public ChessPiece setColor(String color) {
        this.color = color;
        return this;
    }

    public double getValue() {
        return value;
    }

    public ChessPiece setValue(double value) {
        this.value = value;
        return this;
    }

    public String getSquare() {
        return square;
    }

    public ChessPiece setSquare(String square) {
        this.square = square;
        return this;
    }

    public static ChessPieceBuilder builder() {
        return new ChessPieceBuilder();
    }
}
