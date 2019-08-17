package Test;

public class CodeBreaker {
	
	public String adivinar(String numero) {
		char A = ' ';
		char B = ' ';
		String C = "";
		String num = "1234";
		if (!this.validate(numero)) return null;
		for (int n = 0; n < numero.length(); n++) {
			B = numero.charAt(n);
			for (int m = 0; m < num.length(); m++) {
				A = num.charAt(m);
				if (B == A && m == n) {
					C = C + "X";
				} else if (B == A && m != n) {
					C = C + "_";
				}
			}
		}
		return C;
	}

	public boolean validate(String numero) {
		if (numero.length() != 4)
			return false;
		char D = ' ';
		int num = Integer.parseInt(numero);
		for (int j = 0; j < numero.length(); j++) {
			D = numero.charAt(j);
			for (int i = j+1; i < numero.length(); i++) {
				if(numero.charAt(i) == D) return false;
			}
		}
		return true;
	}

}
