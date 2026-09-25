package questao4;
public class MainQuestao4 {
    public static void main(String[] args) {
        Tela tela1 = new Tela(1, "OLED 120Hz", "Touchscreen", 6.7);
        Processador proc1 = new Processador(101, "Octa-core 3.2GHz", "ARM", 3200.0);
        Memoria mem1 = new Memoria(201, "LPDDR5", "RAM", 12.0);
        Celular celular1 = new Celular(5001, "Galaxy S23", "Samsung", tela1, proc1, mem1);
        Jogo jogo1 = new Jogo(1, "Asphalt 9", "Corrida", 2.5);
        Jogo jogo2 = new Jogo(2, "Genshin Impact", "RPG", 15.0);
        celular1.jogos.add(jogo1);
        celular1.jogos.add(jogo2);
        celular1.Ligar();
        celular1.tela.Ligar();
        celular1.processador.Acelerar();
        celular1.memoria.Alocar();
        celular1.Chamar();
        jogo1.Iniciar();
        jogo1.Encerrar();
        celular1.Desligar();
    }
}




