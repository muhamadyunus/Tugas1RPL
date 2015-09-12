import java.util.*;

class mahasiswa
{	
	int i;
	String[] nim= new String [20];
	String[] nama= new String[20];
	short[] angkatan= new short[20];
	String[] jurusan= new String[20];
	char[] jk= new char[20];
	
	
}
class dosen
{	
	int i;
	String[] nip=new String[20];
	String[] nama=new String[20];
	String[] gelar=new String[20];
	boolean[] status=new boolean[20];
}
class matakuliah
{	
	int i;
	String[] kode=new String[20];
	String[] nama=new String[20];
	String[] sifat=new String[20];
	byte[] sks=new byte[20];
}
class fasilitas
{	String[] kode=new String[20];
	String[] jenis=new String[20];
	String[] nama=new String[20];
	short jumlah;
	boolean[] status=new boolean[20];
	int i;

}
public class prakPBO
{	public static void main(String [] args)
	{	Scanner scn = new Scanner(System.in);
		mahasiswa mhs = new mahasiswa();
		dosen dsn = new dosen();
		matakuliah mtk = new matakuliah();
		fasilitas fs = new fasilitas();
		int z=1;
		int[] a=new int[20];
		int b;
		String jk;
		do
		{	System.out.print(" banyak Mahasiswa : ");
			mhs.i=scn.nextInt();
			System.out.print(" Banyak dosen : ");
			dsn.i=scn.nextInt();
			System.out.print(" banyak Matakuliah : ");
			mtk.i=scn.nextInt();
			System.out.print(" banyak fasilitas : ");
			fs.i=scn.nextInt();
			
			for(int i=0; i<mhs.i; i++)
			{	System.out.print("- - - - - - - - - - - - - - - - - - ");
				System.out.print(" Mahasiswa ke-"+(i+1)+"\nNIM	: ");
				mhs.nim[i]=scn.next();
				System.out.print(" Nama	: ");
				mhs.nama[i]=scn.next();
				System.out.print(" Jurusan	: ");
				mhs.jurusan[i]=scn.next();
				System.out.print(" Jenis Kelamin	: ");
				jk=scn.next();
				if(jk=="L"||jk=="l")
				{mhs.jk[i]='L';}
				else if(jk=="P"||jk=="p")
				{mhs.jk[i]='P';}
				
			}
			for(int i=0; i<dsn.i; i++)
			{	System.out.print("- - - - - - - - - - - - - - - - - - ");
				System.out.print(" Dosen ke-"+i+1+"\nNIP	: ");
				dsn.nip[i]=scn.next();
				System.out.print(" Nama	: ");
				dsn.nama[i]=scn.next();
				System.out.print(" Gelar	: ");
				dsn.gelar[i]=scn.next();
				do{
				System.out.print("Status [0/1]	: ");
				b=scn.nextInt();
				}while(b!=0&&b!=1);
				if(b==1)
				{dsn.status[i]=true;}
				else if(b==0)
				{dsn.status[i]=false;}
			
			}
				for(int i=0; i<mtk.i; i++)
				{	System.out.print("\nKode Matakuliah	: ");
					mtk.kode[i]=scn.next();
					System.out.print("Nama Matakuliah	: ");
					mtk.kode[i]=scn.next();
				
			
			}
			for(int i=0; i<fs.i; i++)
			{	System.out.print("- - - - - - - - - - - - - - - - - - ");
				System.out.print(" Kode Fasilitas	: ");
				fs.kode[i]=scn.next();
				System.out.print(" Jenis Fasilitas	: ");
				fs.jenis[i]=scn.next();
				System.out.print(" Nama Peminjam	: ");
				fs.nama[i]=scn.next();
				do{
				System.out.print("Status Fasilitas [0/1]	: ");
				a[i]=scn.nextInt();
				}while(a[i]!=0&&a[i]!=1);
				if(a[i]==1)
				{fs.status[i]=true;}
				else if(a[i]==0)
				{fs.status[i]=false;}
				
			}
			System.out.println("\n================================================");
			System.out.println("NAMA MAHASISWA      NIM    JURUSAN                ");
			System.out.println("==================================================");
				for(int i=0;i<mhs.i;i++){
				System.out.println((i+1)+mhs.nama[i]+"       "+mhs.nim[i]+"       "+mhs.jurusan[i]+"         "+mhs.jk[i]);
				}
			System.out.println("\n================================================");
			System.out.println("NIP         NAMA DOSEN        GELAR         STATUS");
			System.out.println("==================================================");
				{
				for(int i=0;i<dsn.i;i++)
				System.out.println((i+1)+dsn.nip[i]+"       "+dsn.nama[i]+"       "+dsn.gelar[i]+"        "+dsn.status[i]);
				}
			System.out.println("\n================================================");
			System.out.println("KODE FASILITAS    JENIS    NAMA FASILITAS   STATUS");
			System.out.println("==================================================");
				for(int i=0;i<fs.i;i++)
				{
				System.out.println((i+1)+fs.kode[i]+"       "+fs.jenis[i]+"       "+fs.nama[i]+"           "+fs.status[i]);
				}
		z++;
		}
		while(z==0);
	}
}