package patientMedicine;

public class Main {
	public static void main(String[] args) {
		new connection();
		Patient patientObject = new Patient();
		Medicine medicineObject = new Medicine();
		patientObject.getDetails("fever");
		medicineObject.getPatientDetailsGivenMedicineName("paracetamol");
	}
}
