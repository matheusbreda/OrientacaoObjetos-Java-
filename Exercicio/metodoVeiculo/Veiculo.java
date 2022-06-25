package metodoVeiculo;

public class Veiculo {
	
	public double capacidade, consumo, quilometro, combustivel;
	public int passageiro;
	
	public double tanqueViagem () {
		return quilometro / (capacidade * consumo);
	}	
	public double dividirDespesas() {
		return (combustivel * (tanqueViagem() * capacidade)) / passageiro;
	}
	public String toString() {
		return "\nPara viajar "+quilometro+"Km com um veículo de "+capacidade+"L de capacidade no tanque e "+consumo+"Km/L de consumo é necessario "+String.format("%.1f",tanqueViagem())+" vezes a capacidade do tanque"
				+"\nA despesa, com combustivel no valor de R$"+String.format("%.2f", combustivel)+" por litro, foi dividida para "+passageiro+" passageiros totalizando um valor de R$"+String.format("%.2f", dividirDespesas())+" para cada um.\n";		
	}
}
