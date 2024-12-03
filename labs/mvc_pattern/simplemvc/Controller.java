public class Controller {
  private Model model;
  private View view;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  public void setData(String data) {
    model.setData(data);
  }

  public String getData() {
    return model.getData();
  }

  public void updateView() {
    view.printData(model.getData());
  }
}
