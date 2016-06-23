package survival.game.net.packets;

public class Packet04PlayerMove extends Packet {

    private String idOrSecret;
    private float x, y;

    public Packet04PlayerMove(String idOrSecret, float x, float y) {
        super(04);
        this.idOrSecret = idOrSecret;
        this.x = x;
        this.y = y;
    }

    public Packet04PlayerMove(byte[] data){
        super(data);

        idOrSecret = parts[0];
        x = Float.parseFloat(parts[1]);
        y = Float.parseFloat(parts[2]);

    }

    @Override
    public byte[] getData() {
        return ("04"+idOrSecret+","+x+","+y+";").getBytes();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String getIdOrSecret() {
        return idOrSecret;
    }
}
