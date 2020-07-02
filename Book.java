
public class Book extends Magazine{

	String isbn;
	int timeReader;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getTimeReader() {
		return timeReader;
	}
	public void setTimeReader(int timeReader) {
		this.timeReader = timeReader;
	}
	public void read() {
		System.out.println("\nid: "+getId()+"\nTitle: "+getEdition()+"\nEdition: "+getEdition()+"\nEditorial"+getEditorial()+"\nAutor:"+getAutor()+"\nisbn:"+getIsbn()+"\nTiempo de lectura: "+getTimeReader());
	}
	
	}


