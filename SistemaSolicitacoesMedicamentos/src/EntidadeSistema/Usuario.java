package EntidadeSistema;

public class Usuario{

	static Integer setid = 0;
	Integer id = 0;
	String nome;
	String cpf;


	String telefone;
	String email;
	String nomeMedicamento;
	String dose;	

	@Override
	public String toString() {
		return "|| Código: " + id + " || Nome: " + nome + " || CPF: " + cpf + " || Telefone: " + telefone + " || E-mail: " + email + " || Medicamento: " + nomeMedicamento + " || Dosagem: "
				+ dose + " || ";
	}
	public Usuario() {
		this.id = this.setid++;
	}

	public Usuario(String nomeEnviado, String emailEnviado, String telefoneEnviado, String nomeMedicamento, String doseEnviado, String cpfEnviado) {
		
		this.id = this.setid++;
		setNome(nomeEnviado);
		setEmail(emailEnviado);
		setTelefone(telefoneEnviado);
		setNomeMedicamento(nomeMedicamento);
		setDose(doseEnviado);
		setCpf(cpfEnviado);
		
	}

	public Usuario(String nomeEnviado, String telefoneEnviado, String nomeMedicamento, String doseEnviado, String cpfEnviado) {
		this.id = this.setid++;
		setNome(nomeEnviado);
		setTelefone(telefoneEnviado);
		setNomeMedicamento(nomeMedicamento);
		setDose(doseEnviado);
		setCpf(cpfEnviado);

	}


	//get e set
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

}




