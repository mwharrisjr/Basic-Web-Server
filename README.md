# Basic Java Web Server

This project is a Java based multithreaded TCP web server that implements responses for HTTP 200, 301, and 404 codes.
It was made using Java 8 and runs by default on port 6789 of localhost.

This project is licensed under the terms of the MIT license.

## Usage

- Compiling the Program

    - Open console and type **`javac src/WebServer.java`**

- Running the Program

    - Type **`java src/WebServer`** to run the program

- Testing HTTP 200 OK:

    - In your browser of choice type **`localhost:6789/index.html`** into the address bar.
    A webpage should appeart with the text "Hello, World! This is a simple HTML document."
    and an image of a cityscape underneath.

- Testing HTTP 404 Not Found:

    - In your browser of choice type **`localhost:6789/whatever`** into the address bar. An error page
    should load that says "404 Error: Page Not Found" in big bold letters.

- Testing HTTP 301 Moved Permanently (Redirect):

    - In your browser of choice type **`localhost:6789/index`**, **`localhost:6789/`**, **`localhost:6789`**, or
    **`localhost:6789/index.htm`** into the address bar. Typing any of the above will redirect you
    to the index.html page with the Hello message and image.
