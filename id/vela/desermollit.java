Logger mainLogger = Logger.getLogger("com.vega");
mainLogger.setLevel(Level.INFO);
mainLogger.setUseParentHandlers(false);

Handler consoleHandler = new ConsoleHandler();
consoleHandler.setLevel(Level.INFO);
mainLogger.addHandler(consoleHandler);
