public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[101]; 
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim().isEmpty() ? "-" : sb.toString().trim();
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet novoConjunto = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            novoConjunto.conjunto[i] = conjunto[i] || outroConjunto.conjunto[i];
        }
        return novoConjunto;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet novoConjunto = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            novoConjunto.conjunto[i] = conjunto[i] && outroConjunto.conjunto[i];
        }
        return novoConjunto;
    }
}