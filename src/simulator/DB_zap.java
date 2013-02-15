package simulator;



import com.almworks.sqlite4java.SQLiteException;
import config.Application;
import util.DBInterface;
import ASN1.ASN1DecoderFail;

public class DB_zap {
	
	@SuppressWarnings("static-access")
	public static void main (String[] args) throws ASN1DecoderFail, InterruptedException, SQLiteException{
		Application.db = new DBInterface("deliberation-app.db");
		Fill_database f = new Fill_database();
		f.cleanDatabase();
		System.out.println("db_deleted");
	}

}
