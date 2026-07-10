# [COMPUTACIÓN MOVIL] - S12-TRABAJO PRÁCTICO EXPERIMENTAL_4

![Estado](https://img.shields.io/badge/Estado-En_Desarrollo-yellow) ![Git](https://img.shields.io/badge/Git-Workflow-orange)

<p align="center">
  <img src="https://es.abstracta.us/wp-content/uploads/2025/12/getty-images-2IdCr4bXD4U-unsplash-1024x812.jpg" alt="Banner de la Actividad S10 - Equipo de trabajo" width="500">
</p>

---

## 📖 Descripción del Proyecto

Este repositorio contiene el desarrollo correspondiente a la **S12-TRABAJO PRÁCTICO EXPERIMENTAL_4**. El objetivo es implementar los módulos de la aplicación móvil asignados para esta sesión, asegurando la correcta navegación entre actividades, el diseño de la interfaz de usuario y la persistencia de datos local, siguiendo un protocolo estricto de control de versiones y colaboración.

---

## ⚠️ Reglas del Flujo de Trabajo (Git Workflow)

Para asegurar la integridad del proyecto y evitar conflictos durante la colaboración, **todo el equipo debe cumplir estrictamente las siguientes reglas**:

### 1. 🚫 Prohibido subir a `master` (o `main`)

- La rama `master` está reservada exclusivamente para la versión final y estable del proyecto.
- **No hacer `git push` directo a `master`** mientras el desarrollo esté en curso.
- **IMPORTANTE:** Se debe trabajar **siempre en su rama asignada** siguiendo el formato `develop_nombreasignado` (ej: `develop_carlos`). Solo se fusionará al final mediante un Pull Request.

### 2. 🔄 Rutina de Actualización Obligatoria

Antes de empezar a editar código o intentar subir cambios, siempre se debe verificar el estado del repositorio remoto para evitar conflictos:

```bash
# PASO 1: Verificar cambios remotos sin fusionar
git fetch

# PASO 2: Actualizar tu rama local con los cambios del equipo
# Asegúrate de estar en tu rama: develop_carlos
git pull origin develop_carlos