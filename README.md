# Random Phrase Generator

A Java program that generates random phrases from user-defined grammar rules. The program reads a grammar file, stores non-terminals and their possible productions, and recursively expands them to generate complete phrases.

## Features

* Parses grammar definitions from an input file
* Stores non-terminals and their possible productions using Java collections
* Recursively expands non-terminals to generate complete phrases
* Randomly selects productions during phrase generation
* Supports generating multiple phrases from a single grammar
* Accepts the grammar file and number of phrases as command-line arguments

## Technologies

* Java
* Object-Oriented Programming
* HashMap and ArrayList
* Recursion
* File I/O

## Performance

The implementation was evaluated to understand how phrase generation time changes as the grammar and number of non-terminals increase. The project emphasizes keeping phrase generation efficient while recursively expanding grammar rules.

## Project Structure

* `Grammar` - Parses grammar files, stores grammar rules, and recursively generates phrases
* `RandomPhraseGenerator` - Processes command-line arguments and generates the requested number of phrases
