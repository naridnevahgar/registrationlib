def call(String jobName, String projectRepo) {
  freeStyleJob(jobName) {
    scm {
      git(projectRepo, 'master')
    }
    steps {
      maven('clean verify')
    }
  }
}
