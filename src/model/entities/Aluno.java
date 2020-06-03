package model.entities;

public class Aluno {
	
	private int matricula;
	private String name;
	private String celPhone;
	
	public Aluno() {
	}

	public Aluno(int matricula, String name, String celPhone) {

		this.matricula = matricula;
		this.name = name;
		this.celPhone = celPhone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCelPhone() {
		return celPhone;
	}

	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

	public void addContact(String name, String cel) {
		
		this.name = name;
		this.celPhone = cel;
			
	}
	
	public String listarContact(String msg) {
		
		return "";
	}

	@Override
	public String toString() {
		
		StringBuffer todos = new StringBuffer();
		todos.append(matricula);
		todos.append(name);
		todos.append(celPhone);
		return todos.toString();
	}
	
	
}
