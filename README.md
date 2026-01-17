# Threads em Java — Guia Essencial

Este README tem como objetivo consolidar os **principais conceitos sobre Threads em Java**, servindo como material de estudo e referência prática durante a criação de pequenos projetos.

---

## 📌 O que são Threads?

Uma **Thread** é uma unidade básica de execução dentro de um processo. Em Java, um mesmo programa pode executar **múltiplas threads simultaneamente**, permitindo **concorrência** e melhor aproveitamento de recursos de CPU.

* Um **processo** pode conter várias threads
* Threads compartilham o mesmo espaço de memória do processo
* Cada thread possui sua própria pilha de execução

---

## 🧠 Por que usar Threads?

Threads são usadas para:

* Executar tarefas em paralelo
* Melhorar desempenho e responsividade
* Evitar bloqueio da aplicação (ex: interfaces gráficas)
* Processar grandes volumes de dados
* Lidar com múltiplas requisições simultâneas

---

## 🏗️ Formas de Criar Threads em Java

### 1️⃣ Estendendo a classe `Thread`

* Cria-se uma classe que herda de `Thread`
* Sobrescreve-se o método `run()`

**Observação:** limita herança, pois Java não permite herança múltipla.

---

### 2️⃣ Implementando a interface `Runnable` (Recomendado)

* A classe implementa `Runnable`
* A thread é criada passando o `Runnable` para o construtor de `Thread`

**Vantagens:**

* Melhor desacoplamento
* Permite herdar de outras classes

---

### 3️⃣ Usando `Callable` + `Future`

* Permite retorno de valor
* Permite lançar exceções verificadas
* Muito usado com `ExecutorService`

---

## ▶️ Ciclo de Vida de uma Thread

Uma thread pode estar nos seguintes estados:

1. **NEW** – Thread criada, mas não iniciada
2. **RUNNABLE** – Pronta para execução
3. **RUNNING** – Em execução (conceitual)
4. **BLOCKED** – Aguardando um lock
5. **WAITING** – Aguardando indefinidamente
6. **TIMED_WAITING** – Aguardando por tempo determinado
7. **TERMINATED** – Execução finalizada

---

## 🔒 Sincronização de Threads

Como threads compartilham memória, podem ocorrer **condições de corrida (race conditions)**.

### 🔑 `synchronized`

* Garante que apenas uma thread execute um bloco ou método por vez
* Usa um **monitor (lock)**

Pode ser aplicado em:

* Métodos
* Blocos de código

---

## ⚠️ Problemas Comuns em Concorrência

### ❌ Race Condition

Ocorre quando múltiplas threads acessam e modificam o mesmo dado simultaneamente.

### ❌ Deadlock

Duas ou mais threads ficam bloqueadas aguardando recursos entre si.

### ❌ Starvation

Uma thread nunca consegue acesso aos recursos.

### ❌ Livelock

Threads continuam executando, mas sem progresso real.

---

## ⏱️ Métodos Importantes

* `start()` → inicia a thread
* `run()` → lógica da thread
* `sleep()` → pausa temporária
* `join()` → aguarda outra thread
* `interrupt()` → sinaliza interrupção
* `isAlive()` → verifica se está ativa

---

## 🧪 Boas Práticas

* Prefira `Runnable` ou `ExecutorService`
* Evite criar muitas threads manualmente
* Minimize regiões sincronizadas
* Sempre trate interrupções
* Documente o comportamento concorrente

---

## 🎯 Quando NÃO usar Threads

* Processos simples e rápidos
* Código difícil de sincronizar
* Quando a complexidade supera os ganhos
