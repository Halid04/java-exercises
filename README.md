# <p align="">Esercizio 1: Persone</p>
  
Crea una classe chiamata “Persona” con i seguenti attributi: nome, età, sesso. Includi i metodi per impostare e recuperare i valori degli attributi e un metodo per visualizzare tutte le informazioni della persona. Crea poi una classe chiamata “Studente” che estende la classe “Persona” e aggiunge un attributo “matricola” e un metodo per visualizzare il numero di matricola.
    

# <p align="">Esercizio 2: calcolo frequenza parole</p>
  
Scrivere un programma che presa in input una stringa calcoli la frequenza delle
vocali e degli spazi bianchi. Per svolgere questo programma dovrete creare due
classi:

1. Classe gestoreFrase con

-  attributi: testo (tipo String), vocali (int), spazi (int)
-  metodi: costruttori, analizza (data in input una stringa calcola il numero di vocali e di spazi), getFreqVocali(restituisce la frequenza delle vocali),getFreqSpazi(restituisce la frequenza degli spazi)

2. Classe gestoreFraseDriver che conterrà il metodo main e nel quale, una volta richiesta la frase in input, stamperà le frequenze richieste. 
    

# <p align="">Esercizio 3: calcola circonferenza e area cerchi</p>
  
Scrivere il programma che calcola la circonferenza e l’area di due cerchi, con
arrotondamento alle prime tre cifre decimali per il calcolo dell’area del primo
cerchio. Per svolgere questo programma dovrete creare due classi:

A. Classe cerchioArrot con attributo raggio e metodi:

- area (𝐴 = 𝜋𝑟 2 ),
- areaArrotondata (cioè bisognerà ragionare sulle cifre decimali),
- circonferenza (𝐶 = 2𝜋𝑟),
- costruttori ed eventuali setter e getter (solo se necessari)

B. Classe cerchioArrotDrive che conterrà il metodo main e le istanze dei cerchi
per testare i metodi della classe precedente. 
    

# <p align="">Esercizio 4: Biblioteca</p>
  
Creare una classe chiamata “Libro” con i seguenti attributi: titolo, autore, numero di pagine, genere.
Includi i metodi per impostare e recuperare i valori degli attributi e un metodo per visualizzare
tutte le informazioni del libro. Crea una classe “Biblioteca”che contiene
un array di libri e i metodi per aggiungere, rimuovere e visualizzare tutti i libri presenti nella biblioteca.
    

# <p align="">Esercizio 5: Calcolatrice</p>
  
Creare una semplice calcolatrice con la grafica usando swing


# <p align="">Esercizio 6: Rettangolo</p>
  
Crea una classe chiamata “Rettangolo” con i seguenti attributi: lunghezza, larghezza. Includi i metodi per impostare e recuperare i valori degli attributi e un metodo per calcolare l’area del rettangolo. Crea una classe “Casa” che contiene un array di rettangoli (per rappresentare le stanze) e i metodi per aggiungere, rimuovere e visualizzare le informazioni di tutte le stanze.

# <p align="">Esercizio 7: Person</p>
Definire una classe "Person" con gli attributi "name" e "age". Definire una classe "Employee" che estende "Person" e ha un attributo "salary". Definire una classe "Manager" che estende "Employee" e ha un attributo "bonus". Sovrascrivere il metodo "toString" per restituire una stringa che rappresenta l'oggetto in modo leggibile.

# <p align="">Esercizio 8: Esercizio 1</p>
Immagina di dover creare un programma in Java per un distributore di bevande. La macchina devegestire due tipi di bevande e deve essere in grado di dare il resto, se possibile. In caso contrario, devesegnalare al cliente che il denaro immesso non è sufficiente tramite una eccezione.

Per iniziare, è possibile definire una classe chiamata Beverage, che rappresenta una bevanda. Questaclasse deve avere due attributi: il nome della bevanda e il suo prezzo.

Successivamente, è necessario creare una classe chiamata VendingMachine, che rappresenta lamacchina del distributore. Questa classe deve avere due attributi:una struttura dati adeguata pergestire le bevande disponibili nel distributore e il saldo attuale del distributore.
All'interno della classe VendingMachine, si possono definire vari metodi. Il primo metodo è chiamatoinsertCoin e consente all'utente di inserire una moneta nella macchina. Questo metodo deveaggiornare il saldo del distributore.

Il secondo metodo, getBalance, restituisce il saldo attuale del distributore.

Il terzo metodo, getBeverages, restituisce la lista delle bevande disponibili nel distributore.

Il quarto metodo, dispenseBeverage, eroga una bevanda dal distributore e aggiorna il saldo. Tuttavia,prima di farlo, questo metodo deve verificare se il saldo dell'utente è sufficiente per acquistare labevanda richiesta e se la bevanda è disponibile nel distributore. In caso contrario, deve sollevare unaeccezione.

Infine, il quinto metodo, giveChange, restituisce il resto, se possibile, e aggiorna il saldo deldistributore.

Per gestire le eccezioni, è possibile definire due tipi di eccezioni: InsufficientFundsException eBeverageUnavailableException. La prima viene sollevata quando il denaro immesso dall'utente non èsufficiente per acquistare la bevanda richiesta, mentre la seconda viene sollevata quando la bevandarichiesta non è disponibile nel distributore.

Per testare la classe VendingMachine, si può creare una classe chiamata Main e istanziare un oggettodella classe VendingMachine. Infine, si possono chiamare i vari metodi della classe VendingMachine perverificare che funzionino correttamente.

# <p align="">Esercizio 9: Esercizio 2</p>
Supponiamo di voler creare un programma per gestire una lista di oggetti geometrici, come quadrati,rettangoli e cerchi. Ogni oggetto geometrico avrà un'area e un perimetro che calcoleremo tramite
metodi appositi.

Per implementare questo programma, potremmo creare una classe base "Geometria" che definiscealcune proprietà e metodi di base, come la lunghezza e la larghezza dell'oggetto. Ogni classe figlia,come "Quadrato", "Rettangolo" e "Cerchio", eredita da questa classe base e definisce le proprietà e imetodi specifici per il suo tipo di geometria.

Ad esempio, la classe "Quadrato" potrebbe definire una proprietà "lato" e un metodo "calcolaArea" cherestituisce l'area del quadrato (lato lato), mentre la classe "Cerchio" potrebbe definire una proprietà"raggio" e un metodo "calcola_area" che restituisce l'area del cerchio (pi raggio^2).

Per utilizzare queste classi e calcolare le aree e i perimetri degli oggetti, potremmo creare una lista dioggetti geometrici di tipo "Geometria" e utilizzare il polimorfismo per chiamare il metodo"calcola_area" su ogni oggetto. In questo modo, il programma eseguirà il metodo specifico della classecorretta per calcolare l'area dell'oggetto.

# <p align="">Esercizio 10: ArrayList</p>
Sono una serie di esercici semplici per imparare gli ArrayList
- Es 1: Crea un ArrayList di interi e aggiungi i numeri da 1 a 10. Stampa l'intero ArrayList usando un ciclo for.
- Es 2: Crea un ArrayList di stringhe e aggiungi alcune parole. Rimuovi una parola dall'ArrayList utilizzando il suo indice. Stampa l'ArrayList risultante.
- Es 3: Crea un ArrayList di oggetti Persona, dove Persona è una classe con gli attributi nome e età. Aggiungi alcune persone all'ArrayList e stampa solo le persone con un'età superiore a 30.
- Es 4: Scrivi un metodo che accetti un ArrayList di interi e restituisca un nuovo ArrayList contenente solo i numeri pari presenti nell'originale.
- Es 5: Scrivi un metodo che accetti un ArrayList di stringhe e restituisca un nuovo ArrayList contenente solo le stringhe che iniziano con una lettera maiuscola.
    
