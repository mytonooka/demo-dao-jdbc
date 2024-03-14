package db;

public class DbIntegrityExpection extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbIntegrityExpection(String msg) {

		super(msg);
	}

}
