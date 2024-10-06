public class Trem implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("O trem está ganhando velocidade de forma gradual.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando ao longo dos trilhos.");
    }
}
