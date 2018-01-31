package amdocs.mock.ejb;

public enum Message {
	ADD_MESSAGE_ERROR("Error al agregar un msj al repositorio");

	private final String value;

	private Message(final String value) {

		this.value = value;
	}

	public String value() {
		return this.value;
	}
}
