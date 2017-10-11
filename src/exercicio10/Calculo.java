package exercicio10;

public class Calculo {
	
		public double velocidade(double calor, double massa, double variacao, double variacaop){
			double total = 0;
			total = calor * massa * (variacaop - variacao);
			return total;
		}
}
