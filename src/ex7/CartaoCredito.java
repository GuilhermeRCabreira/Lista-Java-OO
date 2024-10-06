public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso via Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do Cartão de Crédito.");
        }
    }

    @Override
    public boolean validarPagamento() {

        return numeroCartao.length() == 16 && cvv.length() == 3 && !validade.isEmpty();
    }
}
