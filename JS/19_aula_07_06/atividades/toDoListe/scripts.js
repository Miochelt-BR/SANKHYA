const newTaskInput = document.getElementById('captureDate'); // Capturando o input de texto
const addTaskButton = document.getElementById('captureButton'); // Capturando o botão
const taskList = document.getElementById('taskList'); // Capturando a lista

// Adicionar nova tarefa
addTaskButton.addEventListener('click', () => {
    const taskText = newTaskInput.value.trim(); // Pegando o texto da tarefa e removendo espaços em branco no início e final
    if (taskText !== '') { // Verificando se o usuário digitou algo
        const newTask = document.createElement('li'); // Criando um novo elemento <li>
        newTask.classList.add('task'); // Adicionando a classe 'task' ao elemento <li>
        newTask.innerHTML = `
            <span class="task-text">${taskText}</span>
            <div class="buttons">
                <button class="button edit-button">Editar</button>
                <button class="button complete-button">Concluir</button>
                <button class="button remove-button">Remover</button>
            </div>
        `;
        taskList.appendChild(newTask); // Adicionando o novo elemento <li> à lista

        // Limpar o campo de entrada
        newTaskInput.value = '';

        // Adicionar eventos para botões de edição, conclusão e remoção
        setupTaskButtons(newTask);
    }
});

// Configurar eventos para botões da tarefa
function setupTaskButtons(taskElement) {
    // Editar
    const editButton = taskElement.querySelector('.edit-button');
    editButton.addEventListener('click', () => {
        const taskText = taskElement.querySelector('.task-text');
        const originalText = taskText.textContent;
        const editText = prompt("Editar tarefa:", originalText);
        if (editText !== null) {
            taskText.textContent = editText;
        }
    });

    // Marcar como concluída
    const completeButton = taskElement.querySelector('.complete-button');
    completeButton.addEventListener('click', () => {
        taskElement.classList.toggle('completed');
    });

    // Remover
    const removeButton = taskElement.querySelector('.remove-button');
    removeButton.addEventListener('click', () => {
        taskList.removeChild(taskElement);
    });
}