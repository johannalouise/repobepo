# Tutorial for installing an GitHub App or Action

## Table of contents
1. [Background and benefits of GitHub Apps and Actions](#back)

    1.1. [Difference between GitHub Apps and Actions](#diff)
   
2. [Installation of GitHub Apps and Actions](#install)

    2.1 [Introduction](#intro)
    
    2.2 [GitHub Marketplace](#market)
    
    2.3 [YAML](#yaml)
    
    2.4 [Webhooks](#web)
    
    2.5 [XML](#xml)
    
3. [Tutorials](#tutor)
    
    3.1 [How to install the app Slack + Github](#slack)
    
    3.2 [How to install GitHub Action using YAML](#action)
    
    3.3 [How to install GitHub Action Discord using webhooks](#discord)
    
4. [Conclusion](#conc)
    
[References](#ref)

<a name="back"> </a>

## Background and benefits with GitHub Apps and Actions

There are a few words that frequently occurs when studying to become a software engineer and two of those 'agile' and 'DevOps'. 
Just as the agile way of working is used to minimize misunderstandings between the customer and the company, DevOps is used to make
sure the development of a service is efficient and contains as few errors as possible. Just like agile principles are 
that you are working in short sprints and deliver often, DevOps principles is to shorten the development cycle and
provide continuous delivery [[1]](https://en.wikipedia.org/wiki/DevOps). DevOps is also used to make the cycle more 
smooth between the different parts of the project (such as backend, frontend) and make the team work more efficient and 
homogeneous. 

The version control system GitHub plays an important role in DevOps, since it helps the team work and to roll-back eventual 
unstable versions. By using GitHub, there is also a possibility to use tools to automate different processes of the DevOps workflow
like the build process and the test process, which helps to smooth the cycle in DevOps. This is possible to do using tools built into GitHub 
called GitHub Actions and GitHub Apps. [[2]](https://github.blog/2019-08-08-github-actions-now-supports-ci-cd/)

<a name="diff"> </a>

#### Difference between a GitHub App and an GitHub Action
Both GitHub Apps and GitHub Actions provide ways to build tools that are useful for the toolchain in DevOps. However, they have some differences that might be necessary to take into consideration when you use or develop one.

An GitHub App can make an action on its own, by using the GitHub's API. For instance, the CI tool [Travis](https://travis-ci.com/) is testing and deploying a project by itself whenever someone make a commit to the repository.

An GitHub Action is a less complicated version of GitHub Apps, since it can run directly on runner machines or in 
[Docker containers](https://en.wikipedia.org/wiki/Docker_(software)) (a standardized, encapsulated environment that runs applications) and you don't need to deploy any code or serve an app in order to use it [[3]](https://help.github.com/en/actions/building-actions/about-actions#comparing-github-actions-to-github-apps).

<a name="install"> </a>

## Installation of GitHub Apps and Actions

<a name="intro"> </a>

### Introduction
In this tutorial, we will show you how to install, step by step, three different apps and actions from the GitHub marketplace. We have decided to show how to install these apps because each one of them contains a part that differs from the others. These parts are also important to understand to be able to install more apps or actions from the GitHub Marketplace. 

Most of the apps and actions in the GitHub Marketplace have a smaller guide on how to install the app or action. However, most of them require that you have some previous knowledge about some of the steps in the guide. They take for granted that all GitHub users know what a webhook is for instance, which are not obvious for everyone. The purpose of this tutorial is to provide you with necessary information that will help you install different GitHub apps and actions in the future. 

In this tutorial, we will go through these areas: 

**Github Marketplace**  
What is the GitHub Marketplace, and how do you use it? For this part, we will also show you how you install the application [Slack + GitHub](https://github.com/marketplace/slack-github) from the GitHub Marketplace.

**YAML**  
What is YAML, and how do you use it to be able to install some of the available GitHub apps or actions? In addition, we will also show you how to install the action [Markdown link check](https://github.com/marketplace/actions/markdown-link-check).

**Webhooks**  
What is a Webhook? How do you use them, and what types of actions triggers them? In this tutorial, we will also demonstrate how you use webhooks to be able to install the action [Discord Message Notify](https://github.com/marketplace/actions/discord-message-notify).

**XML**  
What is XML, and when do you need one? For this part, we will give you an example of an GitHub application that uses an XML-file for Java projects.


<a name="market"> </a>

### GitHub Marketplace
To be able to install an GitHub app or action, you need to visit the marketplace of GitHub Apps. Here is a link to the current available apps and actions in the marketplace: [GitHub Marketplace](https://github.com/marketplace)

![](/images/github_marketplace_apps_actions.png)

In the GitHub marketplace, you will find a lot of different tools that you can install and integrate to your repository at GitHub. Some of the tools are also integrating with other external tools such as
[Slack](https://slack.com/intl/en-se/), [Jupyter](https://jupyter.org/) and [Jira](https://www.atlassian.com/software/jira). 

Most of the apps and actions in the marketplace have individual steps that you need to do to be able to install the app or action.  However, there are some steps that you need to do for several apps in the GitHub marketplace. These steps are:

1. Visit the [GitHub Marketplace](https://github.com/marketplace)
2. Search for the app or action (if you don't find it directly at the front page of the marketplace)
3. Click on the button "Set up plan"
4. Choose which plan you want to use. NOTE: Some of the apps only have one plan, and in those cases you will probably skip this step of the installation.
5. Review you order/plan. Most of the apps have a free plan, but there might be versions that cost in order to be used.
6. Complete the order and begin the installation. 
6. Chose which repositories the app will have access to.

To demonstrate how to install one app or action from the marketplace, we will use the app [Slack + GitHub](https://github.com/marketplace/slack-github). 


<a name="yaml"> </a>

### YAML file 
YAML stands for "YAML Ain't Markup Language" and is a programming language that works well with other programming language 
and for data serialization.[[4]](https://www.tutorialspoint.com/yaml/index.htm) To define and structure the data, YAMl uses 
indentation with spaces. [[7]](https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes) The YAML language is often 
used in applications where data is being stored or transmitted, but also for configuration files. [[8]](https://en.wikipedia.org/wiki/YAML) When 
it comes to GitHub Apps and Actions, YAML files are often used to configure the app or the action in a repository. 


<a name="web"> </a>

### Webhooks
According to Wikipedia, webhooks are user-defined HTTP callbacks that are triggered by a certain event or action. [[5]](https://en.wikipedia.org/wiki/Webhook) Webhooks are used to provide and deliver data to other applications as the event or action happens. [[6]](https://sendgrid.com/blog/whats-webhook/) An example of a typical event that triggers a webhook is when someone push code to a repository. In GitHub, you can decide which events you would like to receive payloads for. There are several types of events in GitHub that can be used for webhooks. For instance:
* Pull requests
* When someone create an issue or add an issue comment
* Push events (when someone push code to a repository)
* When someone forks the repository

If you want to know more about which types of events and actions that can be used for a webhook in GitHub, you can read GitHub's own [documentation](https://developer.github.com/webhooks/) for webhooks in GitHub. 

As we mentioned before, you can decide which types of events a webhook will be triggered by. In the settings of your repository, you can add a webhook and decide if you want to receive payload for all types of events or only specific ones. 

![](/images/webook_settings.png)

The installation of an GitHub app or action that uses webhooks differs between different apps and actions. Down below, we have tried to summarize the most frequent steps that you need to do to be able to install an app or action that uses webhooks.

1. Add the external application's webhook address into your repository's settings.
2. Decide which types of events trigger the webhook.
3. Create an yaml file that consists of the necessary information that you need to configurate the app or action into your repository. Most of the time, the creator of the app or action will give you the code that you need to be able to use the app or action. You will find it in the documentation of the GitHub app or action.
4. Add the yaml file to your repository. Some of the apps and actions require that you put the yaml file in the directory path ``.github / workflows / your_file.yml`` to be able to fulfill the installation correctly. Try it if you don't get it to work.
5. In the yaml file, you will most likely find a line that includes something similar to ``SECRETS: WEBHOOK_ID``, ``SECRETS: ACCESS_TOKEN``, ``SECRETS: GITHUB_SECRET``, which means that you will need to add some parts of the webhook into the "Secrets" in your repository's settings. The purpose of this step is to give access to the external application or action, without have to exploit the secret token or id directly in your repository.

NOTE: Some applications and actions have already done step 1 and 2 for you. Therefore, you might only need to create an yaml file with the needed set up and add some kind of access token into your "Secrets" in the settings of the repository. In our tutorial for the action [Discord Message Notify](https://github.com/marketplace/actions/discord-message-notify), we only need to do the steps 3 to 5 because they handle the first two parts.



<a name="XML"> </a>

### XML file
XML stands for "Extensible Markup Language" and is a markup language for encoding readable documents. 
[[9]](https://en.wikipedia.org/wiki/XML) To define and structure the data, XML uses tags like "< value > ". 
XML provides to access information and make it easier for application use, store, display and transmit data. 
[[10]](https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm). When it comes to Github Apps and Actions, 
XML files are often used for building a POM (Project Object Model) unit which is needed if you want to build a Maven project. 
[[11]](https://www.tutorialspoint.com/maven/maven_pom.htm) One example of an applications that sometimes need a XML file to create a POM unit is the application [Travis](https://github.com/marketplace/travis-ci). 


<a name="tutor"> </a>

## Tutorials

<a name="slack"> </a>

### How to install the app [Slack + GitHub](https://github.com/marketplace/slack-github)

#### Prerequisites
* A Slack account
* A workspace in Slack

If you do not have a Slack account or workspace, please follow the guide on Slack's own 
[website](https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwif55LKy8ToAhUX5ZoKHX45Bx8YABAAGgJsbQ&ohost=www.google.com&cid=CAASEuRortX0GkgC4HvQYVOza5oKqA&sig=AOD64_0PQM7w4K-o45aoLOP1dIHoHc2pcg&q=&ved=2ahUKEwjU_IzKy8ToAhVLY5oKHTusCCYQ0Qx6BAgaEAE&adurl=) 
before you continue with this tutorial.

Firstly, you need to click on the button "Set up a plan". After that, you will be re-directed to the bottom of the page where you 
will see a green button with the text "Install it for free". 

![](/images/github_marketplace_slack.png)

After clicking on the "Install it for free" button, you will be re-directed to another page where you need to review your 
order and begin the installation by clicking on the button "Complete order and begin installation".

![](/images/slack_review_order.png)

You will be able to choose if you want the app to be installed on all repositories or only selected ones, and also confirm your
 choice with your own password.

After you have installed the "Slack + GitHub" app for one of your repositories, you need to go to your Slack account and 
install the GitHub application there too. You will find the application in the "Apps" section in the sidebar. Click on the 
"Add"-button, and then you will be re-directed to Slack's tutorial on how to install the GitHub app in one of your workspaces.

![](/images/slack_apps_view.png)

In Slack's guide, you will receive information on how to subscribe specific repositories to a workspace and a channel, 
but also how to take action in the Slack application. After you have read through Slack's guide on how you use their 
GitHub application, you click on the "Add to Slack" button.

![](/images/slack_guide_github.png)

You will be able to decide which channels the GitHub application will have access to. After you have decided that, you 
click on the "Install" button at the bottom of the page. Shortly after you have clicked on the button, you will be 
re-directed to the workspace in Slack that you have chosen for the installation. After a few minutes, you should have 
received a direct message from the GitHub application in you Slack workspace telling you that you have successfully 
installed GitHub on this Slack workspace.

![](/images/successfully_installed_slack_app.png)

Now you have successfully installed the GitHub application in your Slack workspace. However, you will need to subscribe 
to you repository and connect your GitHub account to the workspace. 

First of all, you will need to write the command /github subscribe owner/repository, where owner is the owner's GitHub 
username and repository is the URL to the repository you want to connect to Slack. After you have done that, you will 
receive a new direct message from the GitHub app with a confirmation link where you need to log in to you GitHub account 
to finish the installation. 

Now you are all set up and have connected your GitHub repository to your Slack workspace! If you want to know how you 
customize your GitHub notifications in Slack, please follow this [link](https://slack.com/intl/en-se/help/articles/232289568-GitHub-for-Slack) 
to Slack's own guide.


<a name="action"> </a>

### How to install GitHub action Markdown Link Check by using a YAML file
 [Markdown link check](https://github.com/marketplace/actions/markdown-link-check) is a GitHub Action that
 automatically checks your markdown files and warns you if it finds any broken links.

You can find the action when searching GitHub Marketplace.

![](/images/action-marketplace.png)

In the documentation of the action, you will find what you need to copy in order to use the action. 

This text is yaml-code that you need to copy and paste into a .yml-fil in your repository. This file should be in a 
directory called "workflows" within a directory called ".github".

![](/images/intellij-yml.png) 

The lines for the .yml file:
```
name: Check Markdown links

on: push

jobs:
  markdown-link-check:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@master
    - uses: gaurav-nelson/github-action-markdown-link-check@v1
```

And this is enough for you to use this action in your GitHub. If you want to use another action, all you
have to do is to copy its yaml-code to the same .yml-file. It's super easy!


<a name="discord"> </a>

### How to install GitHub action Discord Message Notify by using Webhooks

##### Prerequisites
* A Discord account
* A Discord server with a channel

If you do not have a Discord account, please visit Discord's own [website](https://discordapp.com) and create one before you continue with this tutorial.

![](/images/discord_message_notify.png) 

First of all, you need to log into [Discord](https://discordapp.com) and go to the server you would like to connect with your GitHub repository. In the left corner at the top of the page, you will find the Server Settings. 

![](/images/discord_server.png) 

![](/images/discord_settings.png) 

In the settings of the server, you will find an option named Webhooks. In the Webhooks, you can create a webhook that you can use in GitHub for the action Discord Message Notify. 

![](/images/create_discord_webhook.png) 

You can decide what the webhook's name should be, which discord channel it should be connected to and add an image to the webhook in Discord. In this tutorial, the webhook will be called Cat Bot and we have used an free image of a [cat](https://webstockreview.net/pict/getfirst) from Google. You can find the image that we use in the folder named `images` in this repository.

![](/images/edit_webhook.png) 

After you have decided the name of the webhook etc. you can go back to your repository. Now we are going to create the yaml file that contains the set up for the action Discord Message Notify. In the action's [documentation](https://github.com/marketplace/actions/discord-message-notify) you will see some examples of different set ups that you can use for your own repository, and what is the purpose of the different input variables in the set up. 

First of all, if you don't have the folders `.github` and `workflows` you can create them at the same time as the yaml file by naming the file `.github/workflows/discord.yaml`.

![](/images/discord_yaml.png) 

The lines for the discord.yml that we use in this tutorial:

```
name: discord message
on: [push]
jobs:

  build:
    name: Build
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@master
    - name: send custom message with args
      uses: appleboy/discord-action@master
      with:
        webhook_id: ${{ secrets.WEBHOOK_ID }}
        webhook_token: ${{ secrets.WEBHOOK_TOKEN }}
        color: "#00FFB9"
        username: "Cat Bot"
        message: "A new commit has been pushed to johannalouise/repo."

```

After you have created the yaml file, you will need to add your WEBHOOK_ID and WEBHOOK_TOKEN to the Secrets of your repository. Go back to Discord and the settings of your webhook, and copy the webhook's URL. This URL is unique for your own webhook, and it contains an ID and a TOKEN that we need to use to give access to the action. Otherwise, the action will not be able to create messages in our channel.

To clarify which part of the Discord webhook are used for the WEBHOOK_ID and the WEBHOOK_TOKEN see the general example below:

``https://discordapp.com/api/webhooks/WEBHOOK_ID/WEBHOOK_TOKEN``

In the settings of your repository, you will find your Secrets. In the Secrets, you can add a new secret and remove old ones. It is really important that you name the secrets correctly (WEBHOOK_ID and WEBHOOK_TOKEN) and use the right part of the URL for the different secrets. In the image below, we have created two new secrets named WEBHOOK_ID and WEBHOOK_TOKEN.

![](/images/secrets_github.png) 

Now we have installed the action [Discord Message Notify](https://github.com/marketplace/actions/discord-message-notify), and you can test it by creating a new file or make a commit to the repository. If the installation succeeded, you should have received a message in your Discord channel about the new commit in your repository. In our case, the "Cat Bot" have sent us a message about a new commit in this repository.

![](/images/cat_bot_discord.png) 

For this tutorial, we have also created a screencast to demonstrate how to install the action [Discord Message Notify](https://github.com/marketplace/actions/discord-message-notify). Click on the image below to watch the video tutorial for Discord Message Notify.

[![](/images/discord_youtube.png)](https://youtu.be/pBm-eHDz3Og)

<a name="conc"> </a>

## Conclusion

In this tutorial we have covered what GitHub Actions and GitHub Apps are, the benefits of them
and why they are a part of DevOps. We have described four ways to get started with GitHub Apps
and GitHub Actions and also provided detailed tutorials for three of these.

If you want to read more about GitHub Actions, you can visit GitHub's own [webpage](https://help.github.com/en/actions/getting-started-with-github-actions).


<a name="ref"> </a>

### References 

[1] https://en.wikipedia.org/wiki/DevOps

[2] https://github.blog/2019-08-08-github-actions-now-supports-ci-cd/

[3] https://help.github.com/en/actions/building-actions/about-actions#comparing-github-actions-to-github-apps

[4] https://www.tutorialspoint.com/yaml/index.htm 

[5] https://en.wikipedia.org/wiki/Webhook

[6] https://sendgrid.com/blog/whats-webhook/

[7] https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes

[8] https://en.wikipedia.org/wiki/YAML

[9] https://en.wikipedia.org/wiki/XML

[10] https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm

[11] https://www.tutorialspoint.com/maven/maven_pom.htm

### Criteria

We aim to achieve at least these criteria:

**The TA can successful execute all the commands of the tutorial (mandatory)**
* We have added images, lines of code and a video to make it easy for the TA to execute and install and integrate all the actions and apps that we have used in our tutorial.

**The tutorial gives enough background**
* We have added a smaller background for the significant part of each different sub tutorial. We have also added a general background on why you should use GitHub apps and actions.

**The tutorial is easy to follow**
* This criterion is quite subjective, but we have asked some of our family members to try to install an app or actions from our guide, which they did with no problems.
We believe we passed this criterion remarkable, since our family members do not have any specific knowledge of computer science.
We also varied between images, text, and video in order to find something that suites all different learning means.

**The tutorial is original, no such tutorial exists on the web**
* We have not yet found any general tutorial for GitHub apps or actions. 

**The tutorial is successful (attracts comments and success)**
* We are thinking about to contact the creators of the Discord Message Notify and see if they want to use our video tutorial in their documentation. However, we would like to hear your thoughts about the video tutorial for the Discord action (if it is good enough), before we contact them.

**The tutorial is doable in the browser without a local environment (eg on https://www.katacoda.com/) (optional)**
* All material for this tutorial are accessible online. We have made our test repository public if someone want to fork it and test the different GitHub apps and actions with it. All prerequisites for the chosen apps and actions are also accessible online. The video tutorial for the action Discord Message Notify is also uploaded to Youtube.

