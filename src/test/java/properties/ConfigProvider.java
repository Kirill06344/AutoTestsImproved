package properties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
  Config config = readConfig();

  static Config readConfig()
  {
    return ConfigFactory.load("application.conf");
  }

  String URL = readConfig().getString("url");
  String PHONE = readConfig().getString("users.bot.phone");
  String PASSWORD = readConfig().getString("users.bot.password");
}
