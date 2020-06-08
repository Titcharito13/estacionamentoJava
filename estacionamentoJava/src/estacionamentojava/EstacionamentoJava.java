package estacionamentojava;

import javax.swing.JOptionPane;

public class EstacionamentoJava {

    public static void main(String[] args) {
        
        double horaEntrada;
        double horaSaida;
        double tempo;
        double valorTotal;
        
        horaEntrada = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada"));
        horaSaida = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saida"));
        
        tempo = horaSaida - horaEntrada;
        
        valorTotal = Math.ceil(tempo)*4;
        
        JOptionPane.showMessageDialog(null, "Hora da entrada: \n" + horaEntrada+
                "\nHora da Saída: " + horaSaida +
                "\nTempo gasto no estacionamento: "+ tempo+
                "\nValor a pagar: "+ valorTotal);
        
    }
    
}
