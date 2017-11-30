/**
 * Created by ioan on 11/30/17.
 */
public class PairGeneration {
    private Write file;
    private int v[];

    PairGeneration() {

        v=new int[ListOfParticipants.map.size()+1];
        for(int i=1;i<v.length;i++){
            v[i]=0;
        }
        generate();
        afisare();
    }

    private void generate()
    {
        int sw,v_chk[];;
        StdGenerator SG= new StdGenerator(v.length-1);
        v_chk= new int[ListOfParticipants.map.size()+1];
        for(int i=1;i<v_chk.length;i++){
            v_chk[i]=0;
        }
        sw=0;
        while (sw==0){
            int x,y,nr;

            x=SG.next();
            while (v[x]!=0){
                x=SG.next();
            }
            do {
                y = SG.next();
                while ((x==y)||(x==v[y])){
                    y = SG.next();
                }
            } while (v_chk[y]==1);
            v[x]=y;
            v_chk[y]=1;
            nr=0;
            for(int i=1;i<v.length;i++)
                if(v[i]==0)
                    nr++;
            if(nr==0)
                sw=1;
        }
    }

    private void afisare()
    {
        int i;
        Write W;
        for(i=1;i<v.length;i++)
            W=new Write(ListOfParticipants.map.get(String.valueOf(i)),ListOfParticipants.map.get(String.valueOf(v[i])));
    }
}
