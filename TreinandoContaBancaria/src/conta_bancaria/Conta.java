package conta_bancaria;

public class Conta {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public Conta() {

	}

	// construtor
	public Conta(float saldo, boolean status) {
		super();
		this.saldo = 0;
		this.status = false;
	}

	// Getters e Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void estadoAtual() {
		System.out.println("\n===============================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (tipo == "CC") {
			saldo = 50;
		} else if (tipo == "CP") {
			saldo = 150;
		}
		System.out.println("\nConta aberta com sucesso!");
	}

	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta tem saldo positivo, não pode ser fechada.");
		} else if (saldo < 0) {
			System.out.println("Conta com débitos, não pode ser fechada.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float valor) {
		if (status == true) {
			// this.saldo += valor;
			setSaldo(getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso na conta de " + getDono());
		} else {
			System.out.println("Conta inválida");
		}
	}

	public void sacar(float valor) {
		if (status) {
			if (saldo >= valor) {
				setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Conta inválida");
		}
	}

	public void pagarMensal() {
		int vm = 0;
		if (tipo == "CC") {
			vm = 12;
		} else if (tipo == "CP") {
			vm = 20;
		}
		if (status) {
			if (this.saldo > vm) {
				saldo -= vm;
				System.out.println("Mensalidade paga com sucesso por " + getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível pagar");
		}
	}

}
