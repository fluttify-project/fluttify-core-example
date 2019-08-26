enum MAOfflineMapError {
  MAOfflineMapDownloadStatusWaiting,
  MAOfflineMapDownloadStatusStart,
  MAOfflineMapDownloadStatusProgress,
  MAOfflineMapDownloadStatusCompleted,
  MAOfflineMapDownloadStatusCancelled,
  MAOfflineMapDownloadStatusUnzip,
  MAOfflineMapDownloadStatusFinished,
  MAOfflineMapDownloadStatusError,
  MAOfflineMapErrorUnknown,
  MAOfflineMapErrorCannotWriteToTmp,
  MAOfflineMapErrorCannotOpenZipFile,
  MAOfflineMapErrorCannotExpand
}