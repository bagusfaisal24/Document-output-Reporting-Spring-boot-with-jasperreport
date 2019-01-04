import project.Writer;

public class Utama{

	public String generate(PegawaiModel pegawai){
		String DEST = "tmp/reporting.pdf"; //path location hasil generate

		//initialize data
		pegawai = pegawai.repository.findById(int id); 
		
		//define paramater

		Map<String, Object> parameters = new HashMap<>();
        parameters.put("FIRST_NAME", pegawai.firstName);
        parameters.put("LAST_NAME", pegawai.lastName;
        parameters.put("SALARY", pegawai.salary);

		InputStream is = getClass().getResourceAsStream("/employeeReport.jrxml");
        Writer.write(is, parameters, DEST);

        return DEST;
	}
}