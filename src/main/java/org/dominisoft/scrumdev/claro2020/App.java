package org.dominisoft.scrumdev.claro2020;

import java.util.HashMap;
import java.util.Map;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.ClasspathLoader;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinPebble;

/**
 * Hello world.
 *
 */
public final class App {
  /**
   * Default port.
   */
  public static final int DEFAULT_PORT = 7000;

  private static Javalin app;

  /**
   * Prevent instantiation.
   */
  private App() {
  }

  /**
   * Entry point.
   *
   * @param args Console arguments
   */
  public static void main(final String[] args) {
    app = Javalin.create(config -> {
      config.addStaticFiles("/html");
    }).start(DEFAULT_PORT);

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      app.stop();
    }));

    app.events(event -> {
      event.serverStopping(() -> {
        System.out.println("The server is stopping.");
      });
      event.serverStopped(() -> {
        System.out.println("Server is gone!");
      });
    });
    
    JavalinRenderer.register(JavalinPebble.INSTANCE, ".peb", ".pebble");
    PebbleEngine engine = new PebbleEngine.Builder().loader(new ClasspathLoader()).build();
    JavalinPebble.configure(engine);

    app.post("/init-voting", ctx -> {
      //ctx.contentType("text/html; charset=UTF-8");
      //final String rawCedula = ctx.req.getParameter("id");

      // DopNationalIdentificationNumber cedula2 = new
      // DopNationalIdentificationNumber(rawCedula);

//      ctx.result(
//          String.format("TODO: Validate ID '%s' (Cédula)!!!", rawCedula));
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("PebbleMessage", "Hola Equipo BBBB!!!");
      ctx.render("hello-world.pebble", model);
    });

    app.after(ctx -> {
      // run after all requests
      final String whatHappened = ctx.req.getMethod() + " "
          + ctx.req.getRequestURI() + " -> " + ctx.res.getStatus();
      System.out.println("whatHappened: " + whatHappened);
    });
  }

  /**
   * Stops the server.
   */
  public static void stop() {
    app.stop();
  }
}
