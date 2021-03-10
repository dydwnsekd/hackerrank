SELECT challenges.hacker_id, challenges.difficulty_level, submissions.score
FROM challenges
JOIN submissions
ON challenges.hacker_id = submissions.hacker_id;