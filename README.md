# JAVA_STREAM_PRINTWRITER
Permettere di scrivere qualsiasi contenuto (anche byte e oggetti) codificato come stringa nel file associato, molto usato nelle applicazioni web (Servlet).
Costruttiri:
<ol>
  <li>PrintWriter(File f)</li>
  <li>PrintWriter(String nome)</li>
</ol>
Metodi principali:
<ol>
  <li>void print(tipo nome): tipo base o oggetto.</li>
  <li>void println(tipo nome): tipo base o oggetto.</li>
  <li>append(tipo nome): aggiunge alla fine del file il contenuto</li>
  <li>flush(): svuota lo stream e forza la scrittura</li>  
  <li>close(): chiude lo stream</li>    
</ol>
