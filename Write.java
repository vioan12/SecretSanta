import java.io.FileWriter;

/**
 * Created by ioan on 11/30/17.
 */
public class Write {
    private String filename,value;
    private FileWriter out = null;

    Write(String filename,String value){
        this.filename=filename;
        this.value=value;
        start();
    }
    private void start()
    {
        try {
            out = new FileWriter(filename+".txt");
            out.write("Secret Santa este o traditie occidentala de Craciun. O modalitate placuta pentru multi oameni de a da si a primi un cadou.\nCompasiunea comuna de la un act de bunatate spontana este inaltatoare, nepretuita si greu de explicat. E o conexiune instantanee intre suflete, care pot schimba vieti, pot genera un zimbet, fiind un Mos Craciun Secret ai binecuvantari dincolo de cuvinte.\n\nParticiparea la aceasta activitate este voluntara de aceea, "+filename+" iti multumim ca ai facut aceasta alegere, ve fi un Mos Craciun Secret pentru "+value+".\n\nFarmecul zilelor de Craciun sa te insufleteasca si sa-ti lumineze toata fiinta! Bucura-te de adevarata semnificatie a acestei sarbatori.\nCRACIUN FERICIT!!! ");
            out.close();
        }catch (Exception e) {
            System.err.println(e);
        }
    }

}
