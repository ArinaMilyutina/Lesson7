package task3;

public class Register {
    private int pointer = 0;
    private Document[] documents = new Document[10];

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public Document[] getDocuments() {
        return documents;
    }

    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    public boolean addDocument(Document document) {
        if (pointer < 10) {
            documents[pointer] = document;
            pointer++;
            return true;
        }
        return false;
    }

    public void getLastDocumentInfo() {
        documents[pointer - 1].printInfo();
    }

}
