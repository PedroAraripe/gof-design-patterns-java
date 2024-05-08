import factories.AMDPcFactory;
import factories.GamerPcFactory;
import factories.IntelPcFactory;
import setup.Setup;

public class Demo {
  public static Setup configureSetup() {
    Setup setup;
    GamerPcFactory gamerPcFactory;

    String typeProcessor = "AMD";

    if(typeProcessor == "AMD") {
      gamerPcFactory = new AMDPcFactory();
    } else {
      gamerPcFactory = new IntelPcFactory();
    }

    setup = new Setup(gamerPcFactory);

    return setup;
  }

  public static void main(String[] args) {
    Setup setup = configureSetup();

    setup.checkInitialization();
  }
}
